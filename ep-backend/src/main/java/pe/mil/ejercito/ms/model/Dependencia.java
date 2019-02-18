package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity//LLAMA A LA ENTIDAD, referencia a aun objeto
@Table(name="EP_DEPENDENCIA")//LLAMA A LA ATBLA
public class Dependencia {
	
	 //TOMA A LA LLAVE PRIMARIA
	//@GeneratedValue(generator="sq_dependencia")//GENERAR TU CODIGO YA SEA POR UNA SECUENCIA O EL JAVA
	//@SequenceGenerator(name="sq_dependencia",sequenceName="\"SQ_DEPENDENCIA\"", allocationSize=1) 
	
	@Id
	@Column( name="CDEPENDENCIA_CODIGO")
	private String codigoDependencia;

	@Column( name="VDEPENDENCIA_NOMBRE")
	private String nombreDependencia;
	
	@Column( name="VDEPENDENCIA_ABREVIADO")
	private Integer abreviadoDependencia;
	
	@Column( name="CDEPENDENCIA_PREFIJO")
	private String prefijoDependencia;

	public String getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public String getNombreDependencia() {
		return nombreDependencia;
	}

	public void setNombreDependencia(String nombreDependencia) {
		this.nombreDependencia = nombreDependencia;
	}

	public Integer getAbreviadoDependencia() {
		return abreviadoDependencia;
	}

	public void setAbreviadoDependencia(Integer abreviadoDependencia) {
		this.abreviadoDependencia = abreviadoDependencia;
	}

	public String getPrefijoDependencia() {
		return prefijoDependencia;
	}

	public void setPrefijoDependencia(String prefijoDependencia) {
		this.prefijoDependencia = prefijoDependencia;
	}
	
	

}
