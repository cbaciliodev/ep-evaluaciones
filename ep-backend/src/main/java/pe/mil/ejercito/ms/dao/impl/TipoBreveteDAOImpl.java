package pe.mil.ejercito.ms.dao.impl;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.dao.TipoBreveteDAO;
import pe.mil.ejercito.ms.model.TipoBrevete;

@Repository
public class TipoBreveteDAOImpl extends BaseDAOImpl<TipoBrevete> implements TipoBreveteDAO{
	
	public TipoBreveteDAOImpl() {
		super(TipoBrevete.class);
	}
	

}
