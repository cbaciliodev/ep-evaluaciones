package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_REQUISITO")

public class Requisito {

    //Son anotaciones 
	//ID es el primary key
	//Hace una secuencia de la tabla SQ_REQUISITO
	//
	@Id
	@GeneratedValue(generator="SQ_REQUISITO")
	@SequenceGenerator(name="SQ_REQUISITO",sequenceName="SQ_REQUISITO", allocationSize=1)
	
	@Column( name="CREQUISITO_CODIGO")
	private int requisitoCodigo;
	
	@Column( name="VREQUISITO_NOMBRE")
	private String requisitoNombre;

	public int getRequisitoCodigo() {
		return requisitoCodigo;
	}

	public void setRequisitoCodigo(int requisitoCodigo) {
		this.requisitoCodigo = requisitoCodigo;
	}

	public String getRequisitoNombre() {
		return requisitoNombre;
	}

	public void setRequisitoNombre(String requisitoNombre) {
		this.requisitoNombre = requisitoNombre;
	}
	
	
}
