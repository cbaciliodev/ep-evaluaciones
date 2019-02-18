package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.TipoBreveteDAO;
import pe.mil.ejercito.ms.model.TipoBrevete;
import pe.mil.ejercito.ms.services.TipoBreveteService;

@Service
public class TipoBreveteServiceImpl implements TipoBreveteService{
	
	@Autowired
	private TipoBreveteDAO tipoBreveteDAO;

	@Override
	public List<TipoBrevete> listarTipoBrevete() {
		// TODO Auto-generated method stub
		return tipoBreveteDAO.listarTodos();
	}
	
	
	}


