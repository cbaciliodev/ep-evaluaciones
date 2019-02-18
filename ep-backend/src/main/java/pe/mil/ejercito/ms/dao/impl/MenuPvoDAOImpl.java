package pe.mil.ejercito.ms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.mil.ejercito.ms.dao.MenuPvoDAO;
import pe.mil.ejercito.ms.model.MenuPvo;
import pe.mil.ejercito.ms.model.Usuario;


@Repository
@Transactional

public class MenuPvoDAOImpl extends BaseDAOImpl<MenuPvo>  implements MenuPvoDAO{
	
	public MenuPvoDAOImpl() {
		super(MenuPvo.class);
	}	

}
