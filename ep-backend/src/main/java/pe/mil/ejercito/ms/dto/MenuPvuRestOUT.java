package pe.mil.ejercito.ms.dto;

import org.springframework.beans.BeanUtils;

import pe.mil.ejercito.ms.model.MenuPvo;

public class MenuPvuRestOUT extends ResponseBaseDTO{
	
	private String menuCodigo;
	private String menuNombre;
	
	public static MenuPvuRestOUT parseToMenuPvuRestOUT( MenuPvo domain ) {
		
		if( domain==null ) {
			return null;
		}
		
		MenuPvuRestOUT uRestOUT = new MenuPvuRestOUT();
		BeanUtils.copyProperties(domain, uRestOUT);
		
		return uRestOUT;
	}
	
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
