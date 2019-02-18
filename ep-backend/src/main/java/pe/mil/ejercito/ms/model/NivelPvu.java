package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EP_NIVEL_PVU")
public class NivelPvu {

	@Id
	@Column(name="CNIVEL_CODIGO")
	private Character codigo;
	
	@Column(name="VNIVEL_NOMBRE")
	private Long nombre;

	public Character getCodigo() {
		return codigo;
	}

	public void setCodigo(Character codigo) {
		this.codigo = codigo;
	}

	public Long getNombre() {
		return nombre;
	}

	public void setNombre(Long nombre) {
		this.nombre = nombre;
	}
	
}
