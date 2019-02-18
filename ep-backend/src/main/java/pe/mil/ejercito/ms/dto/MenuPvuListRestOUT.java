package pe.mil.ejercito.ms.dto;

import java.util.ArrayList;
import java.util.List;

public class MenuPvuListRestOUT {
	
	private List<MenuPvuRestOUT> menuPvu;
	
	public MenuPvuListRestOUT() {
		menuPvu = new ArrayList<>();
	}

	public List<MenuPvuRestOUT> getMenuPvu() {
		return menuPvu;
	}

	public void setMenuPvu(List<MenuPvuRestOUT> menuPvu) {
		this.menuPvu = menuPvu;
	}

	
	public void addMenuPvuRest( MenuPvuRestOUT mPvu ) {
		menuPvu.add(mPvu);
	}
	
}
