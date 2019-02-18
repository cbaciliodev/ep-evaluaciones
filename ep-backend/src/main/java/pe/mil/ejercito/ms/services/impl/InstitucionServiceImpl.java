package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.InstitucionDAO;
import pe.mil.ejercito.ms.model.Institucion;
import pe.mil.ejercito.ms.services.InstitucionService;

@Service
public class InstitucionServiceImpl implements InstitucionService {

	@Autowired
	private InstitucionDAO InstitucionDAO;
	
	
	@Override 
	public List<Institucion> ListaInstitucion() {
		// TODO Auto-generated method stub
		return InstitucionDAO.listarTodos();
	}

}
