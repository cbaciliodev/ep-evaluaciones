package pe.mil.ejercito.ms.dao.impl;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.dao.ParametroDAO;
import pe.mil.ejercito.ms.model.Parametro;

@Repository

public class ParametroDAOImpl extends BaseDAOImpl<Parametro> implements ParametroDAO{

	public ParametroDAOImpl() {	
		super(Parametro.class);
	}

}
