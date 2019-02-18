package pe.mil.ejercito.ms.dao.impl;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.dao.RequisitoDAO;
import pe.mil.ejercito.ms.model.Requisito;

@Repository
public class RequisitoDAOImpl extends BaseDAOImpl<Requisito> implements RequisitoDAO{

	
	public RequisitoDAOImpl() {
		super(Requisito.class);
	}
	
	
		

}
