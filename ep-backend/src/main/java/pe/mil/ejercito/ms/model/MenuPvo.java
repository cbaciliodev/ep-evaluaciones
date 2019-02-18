package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_MENU_PVU")
public class MenuPvo {
	
	//@GeneratedValue(generator="sq_menu")
	//@SequenceGenerator(name="sq_menu",sequenceName="SQ_MENU", allocationSize=1)
	
	@Id
	@Column( name="VMENU_CODIGO")
	private String menuCodigo;
	
	@Column( name="VMENU_NOMBRE")
	private String menuNombre;
	
	public String getMenuCodigo() {
		return menuCodigo;
	}
	public void setMenuCodigo(String menuCodigo) {
		this.menuCodigo = menuCodigo;
	}
	public String getMenuNombre() {
		return menuNombre;
	}
	public void setMenuNombre(String menuNombre) {
		this.menuNombre = menuNombre;
	}
	
	
	
	
	

}
