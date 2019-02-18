package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_SANGRE")

public class Sangre {

	@Id //TOMA A LA LLAVE PRIMARIA
	@GeneratedValue(generator="sq_sangre")//GENERAR TU CODIGO YA SEA POR UNA SECUENCIA O EL JAVA
	@SequenceGenerator(name="sq_sangre",sequenceName="\"SQ_SANGRE\"", allocationSize=1) 
	
	@Column(name="NSANGRE_COD")
	private Long codigoSangre;
	
	@Column(name="VSANGRE_DESLAR")
	private String deslarSangre;
	
	@Column(name="VSANGRE_DESCOR")
	private String descorSangre;
	
	
	public Long getCodigoSangre() {
		return codigoSangre;
	}

	public void setCodigoSangre(Long codigoSangre) {
		this.codigoSangre = codigoSangre;
	}

	public String getDeslarSangre() {
		return deslarSangre;
	}

	public void setDeslarSangre(String deslarSangre) {
		this.deslarSangre = deslarSangre;
	}

	public String getDescorSangre() {
		return descorSangre;
	}

	public void setDescorSangre(String descorSangre) {
		this.descorSangre = descorSangre;
	}

}
