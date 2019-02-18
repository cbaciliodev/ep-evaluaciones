package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_ROL_PVU")
public class RolPvu {
	
	@Id
	@GeneratedValue(generator="SQ_ROL")
	@SequenceGenerator(name="SQ_ROL",sequenceName="SQ_ROL", allocationSize=1)
	@Column(name="NROL_CODIGO")
	private String codigoRol;
	
	@Column(name="VROL_NOMBRE")
	private String nombreRol;
	@Column(name="VROL_PRIVILEGIO")
	private String privilegioRol;
	
	//GETTERS AND SETTERS
	public String getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(String codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	public String getPrivilegioRol() {
		return privilegioRol;
	}
	public void setPrivilegioRol(String privilegioRol) {
		this.privilegioRol = privilegioRol;
	}
	
}
