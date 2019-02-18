package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.RequisitoDAO;
import pe.mil.ejercito.ms.model.Requisito;
import pe.mil.ejercito.ms.services.RequisitoService;

@Service
public class RequisitoServiceImpl implements RequisitoService {

	
	@Autowired
	private RequisitoDAO RequisitoDAO;
	
	
	@Override
	public List<Requisito> ListaTodos() {
		// TODO Auto-generated method stub
		return RequisitoDAO.listarTodos();
	}
	
	
	
	

}
