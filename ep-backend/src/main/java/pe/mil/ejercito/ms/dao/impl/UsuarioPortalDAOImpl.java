package pe.mil.ejercito.ms.dao.impl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.mil.ejercito.ms.dao.UsuarioPortalDAO;
import pe.mil.ejercito.ms.model.Usuario;
@Repository
@Transactional
public class UsuarioPortalDAOImpl extends BaseDAOImpl<Usuario>  implements UsuarioPortalDAO{

	public UsuarioPortalDAOImpl() {
		super( Usuario.class );
	}

}