package pe.mil.ejercito.ms.exception;

import pe.mil.ejercito.ms.commons.LoggerService;

public class ValidateException extends Exception{

	private static final long serialVersionUID = -4766377141517875008L;

	private LoggerService logger;
	
	private Exception ex;
	private Integer cod;
	private String message;
	
	public ValidateException(Integer cod, String message) {
		super(message);
		this.cod = cod;
		this.message = message;
	}

	public ValidateException(Exception ex, Integer cod, String message) {
		super(message);
		setLogger(message, ex);
		this.ex = ex;
		this.cod = cod;
	}

	private void setLogger(String message, Exception ex) {
		logger = new LoggerService();
		logger.warn(message, ex);
	}

	public Integer getCod() {
		return cod;
	}

	public Exception getEx() {
		return ex;
	}

	public String getMessage() {
		return message;
	}
}
