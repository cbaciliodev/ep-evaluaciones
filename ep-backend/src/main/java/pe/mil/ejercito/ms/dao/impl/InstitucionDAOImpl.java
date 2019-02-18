package pe.mil.ejercito.ms.dao.impl;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.dao.InstitucionDAO;
import pe.mil.ejercito.ms.model.Institucion;

@Repository
public class InstitucionDAOImpl extends BaseDAOImpl<Institucion> implements InstitucionDAO {

	public InstitucionDAOImpl() {
		super(Institucion.class);
		// TODO Auto-generated constructor stub
	}

}
