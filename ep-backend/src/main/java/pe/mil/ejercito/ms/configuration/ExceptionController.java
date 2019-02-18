package pe.mil.ejercito.ms.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import pe.mil.ejercito.ms.commons.LoggerService;
import pe.mil.ejercito.ms.dto.ResponseBaseDTO;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseBaseDTO> handleAException(Exception ex) {
		LoggerService log = new LoggerService();
		log.fatal(ex.getMessage(), ex);

		ResponseBaseDTO response = new ResponseBaseDTO();
		response.setpErrCode( 000 );
		response.setpErrMsg( ex.getMessage() );
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
