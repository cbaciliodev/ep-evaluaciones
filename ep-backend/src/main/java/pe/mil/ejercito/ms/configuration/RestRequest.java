package pe.mil.ejercito.ms.configuration;

import static pe.mil.ejercito.ms.commons.Constant.*;
import static pe.mil.ejercito.ms.commons.FunctionsUtil.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class RestRequest implements Filter {
	
	final Logger logger = LogManager.getLogger(RestRequest.class);
	
	@Autowired
	private Environment env;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = ((HttpServletRequest)request);
		HttpServletResponse res = ((HttpServletResponse)response);
		
		String token = req.getHeader(HEADER_AUTHORIZACION_KEY);
		String urlWeb = req.getRequestURL().toString();
		
		if( inList( urlWeb, toArray( env.getProperty(PROP_REST_RESOURCE_EXCLUDE), ",") ) ) {
			chain.doFilter(request, response);
			return;
		}
		
		if ( isEmpty( token ) ) {

			try {
				// curl -X GET "https://www.googleapis.com/oauth2/v1/userinfo" -H"Authorization: Bearer ya29.GlxnBpM_DQ-Ej24WXJMEXuMX0Cb2C1YAyicASJQmw9NnZlqK0KIhl1hdFOCnkPtM8z6zUjTZmq90GcVeUd6SHesKOeQ_i4B22NcyxhWYBkmXmxnyWfXfgSh00KbdJQ"
				// https://any-api.com/googleapis_com/oauth2/console/userinfo/oauth2_userinfo_get
				
				URL url = new URL( env.getProperty( PROP_REST_ENDPOINT ) );

				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestProperty( REST_HEADER_AUTHORIZATION , token);
				con.connect();
				
				if ( con.getResponseCode()==REST_RESPONSE_UNAUTHORIZATION ) {
					res.sendError(HttpServletResponse.SC_UNAUTHORIZED, env.getProperty( PROP_MSG_HTTP_ERR_NOAUT ));
					return;
			    }
				
				if ( con.getResponseCode()!=REST_RESPONSE_OK ) {
					res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, env.getProperty( PROP_MSG_HTTP_ERR_SERV ));
					return;
			    }
								
				con.disconnect();
				chain.doFilter(request, response);
				return;
				
			} catch ( IOException e ) {
				logger.error( e.getMessage() );
			}

			res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, PROP_MSG_HTTP_ERR_SERV);
			return;
		}

		res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, env.getProperty( PROP_MSG_HTTP_ERR_NOAUT ));

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void destroy() {
		
	}
}
