package pe.mil.ejercito.ms.commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {

	private static final Logger log = LogManager.getLogger("ms");
	
	public void debug(String message) {
		if (log.isDebugEnabled()) {
			log.debug(message);
		}
	}

	public void trace(String message) {
		if (log.isTraceEnabled()) {
			log.trace(message);
		}
	}

	public void info(String message) {
		if (log.isInfoEnabled()) {
			log.info(message);
		}
	}

	public void warn(String message) {
		log.warn(message);
	}

	public void warn(String message, Throwable ex) {
		log.warn(message, ex);
	}

	public void error(String message) {
		log.error(message);
	}

	public void error(String message, Throwable exception) {
		log.error(message, exception);
	}
	
	public void fatal(String message, Throwable ex) {
		log.fatal(message, ex);
	}
}
