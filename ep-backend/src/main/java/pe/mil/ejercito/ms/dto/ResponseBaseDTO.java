package pe.mil.ejercito.ms.dto;

import static pe.mil.ejercito.ms.commons.Constant.*;

public class ResponseBaseDTO {
	private Integer pErrCode;
	private String pErrMsg;
	
	public ResponseBaseDTO() {
		errorException( NO_ERROR , "" );
	}
	
	public void errorException( Integer pErrCode,  String pErrMsg) {
		this.pErrCode = pErrCode;
		this.pErrMsg = pErrMsg;
	}
	
	public String getpErrMsg() {
		return pErrMsg;
	}
	public void setpErrMsg(String pErrMsg) {
		this.pErrMsg = pErrMsg;
	}
	public Integer getpErrCode() {
		return pErrCode;
	}
	public void setpErrCode(Integer pErrCode) {
		this.pErrCode = pErrCode;
	}
}
