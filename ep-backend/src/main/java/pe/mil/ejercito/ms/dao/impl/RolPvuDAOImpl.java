package pe.mil.ejercito.ms.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.mil.ejercito.ms.dao.RolPvuDAO;
import pe.mil.ejercito.ms.model.RolPvu;

@Repository
@Transactional

public class RolPvuDAOImpl extends BaseDAOImpl<RolPvu>  implements RolPvuDAO{
	
	public RolPvuDAOImpl() {
		super(RolPvu.class);
	}	

}
