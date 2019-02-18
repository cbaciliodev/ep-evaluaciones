package pe.mil.ejercito.ms.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.MenuPvoDAO;
import pe.mil.ejercito.ms.dto.MenuPvuListRestOUT;
import pe.mil.ejercito.ms.dto.MenuPvuRestOUT;
import pe.mil.ejercito.ms.model.MenuPvo;
import pe.mil.ejercito.ms.services.MenuPvoService;

import static pe.mil.ejercito.ms.commons.FunctionsUtil.*;

@Service
public class MenuPvoServiceImpl implements MenuPvoService{

	@Autowired
	private MenuPvoDAO menuPvoDAO;
	
	@Override
	public MenuPvuListRestOUT listarMenu() {
		
		MenuPvuListRestOUT mplr = new MenuPvuListRestOUT();
		List<MenuPvo> menusPvu = menuPvoDAO.listarTodos();
		
//		if ( !isEmpty( menusPvu ) ) {
//			
//			List<MenuPvuRestOUT> menusPvuRest = new ArrayList<>();
//			
//			for( MenuPvo mp : menusPvu ) {
//				menusPvuRest.add(MenuPvuRestOUT.parseToMenuPvuRestOUT(mp)) ;
//			}
//			
//			mplr.setMenuPvu( menusPvuRest );
//			
//		} 
		
		if ( !isEmpty( menusPvu ) ) {
			
			for( MenuPvo mp : menusPvu ) {
				mplr.addMenuPvuRest( MenuPvuRestOUT.parseToMenuPvuRestOUT(mp) );
			}
			
		} 
		
		return mplr;
	}

}
