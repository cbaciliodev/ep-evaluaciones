package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.ParametroDAO;
import pe.mil.ejercito.ms.model.Parametro;
import pe.mil.ejercito.ms.services.ParametroService;

@Service

public class ParametroServiceImpl  implements ParametroService{

	
	@Autowired
	private ParametroDAO parametroDAO;

	@Override
	public List<Parametro> listaParametro() {
		// TODO Auto-generated method stub
		return parametroDAO.listarTodos();
	} 
	
	
	

}
