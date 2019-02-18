package pe.mil.ejercito.ms.exception;

import pe.mil.ejercito.ms.commons.LoggerService;

public class MsException extends Exception{
	

	private static final long serialVersionUID = -800914517735632101L;


	LoggerService logger;


	private Exception ex;
	private Integer cod;

	public MsException(Integer cod, Exception ex) {
		super(ex.getMessage());
		setLogger(ex.getMessage(), ex);
		this.cod = cod;
		this.ex = ex;
	}

	private void setLogger(String message, Exception ex) {
		logger = new LoggerService();
		logger.error(message, ex);
	}

	public Exception getEx() {
		return ex;
	}

	public Integer getCod() {
		return cod;
	}
}
