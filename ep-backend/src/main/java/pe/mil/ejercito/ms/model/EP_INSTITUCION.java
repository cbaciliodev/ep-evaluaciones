package pe.mil.ejercito.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_INSTITUCION")

public class EP_INSTITUCION {
	
	@Id  
	@GeneratedValue(generator="sq_institucion") 
	@SequenceGenerator(name="sq_institucion",sequenceName="\"SQ_INSTITUCION\"", allocationSize=1)
	private Long id;

	private String nombre;
	private String abreviado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviado() {
		return abreviado;
	}
	public void setAbreviado(String abreviado) {
		this.abreviado = abreviado;
	}
	

}
