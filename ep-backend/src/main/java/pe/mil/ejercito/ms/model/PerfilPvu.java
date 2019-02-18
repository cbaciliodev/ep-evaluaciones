package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EP_PERFIL_PVU")
public class PerfilPvu {
	
	@Id
	@Column(name = "CPERFIL_CODIGO")
	private String codigo;
	
	@Column(name = "VPERFIL_NOMBRE")
	private String nombre;
	
	@Column(name = "VMENU_CODIGO")
	private String menuCodigo;
	
	@Column(name = "CMENU_ACTIVO")
	private Character activo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMenuCodigo() {
		return menuCodigo;
	}

	public void setMenuCodigo(String menuCodigo) {
		this.menuCodigo = menuCodigo;
	}

	public Character getActivo() {
		return activo;
	}

	public void setActivo(Character activo) {
		this.activo = activo;
	}
	
	

}
