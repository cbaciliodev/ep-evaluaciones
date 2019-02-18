package pe.mil.ejercito.ms.exception;

import pe.mil.ejercito.ms.commons.LoggerService;

public class DataBaseException extends Exception{

	private static final long serialVersionUID = -1403026729455280650L;

	private LoggerService logger;

	private Exception ex;
	private Integer cod;
	private String codErrorMessage;
	private String message;

	public DataBaseException(Integer codigo, String message) {
		super(message);
		this.cod = codigo;
		this.message = message;
	}

	public DataBaseException(Exception ex, Integer codigo, String codigoErrorMessage, String message) {
		super(message);
		setLogger(message, ex);
		this.ex = ex;
		this.cod = codigo;
		this.codErrorMessage = codigoErrorMessage;
	}

	private void setLogger(String message, Exception ex) {
		logger = new LoggerService();
		logger.error(message, ex);
	}

	public String getMessage() {
		return message;
	}

	public Exception getEx() {
		return ex;
	}

	public Integer getCod() {
		return cod;
	}

	public String getCodErrorMessage() {
		return codErrorMessage;
	}

}
