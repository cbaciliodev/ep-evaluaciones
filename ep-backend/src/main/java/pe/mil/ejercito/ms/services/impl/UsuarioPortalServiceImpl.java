package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.mil.ejercito.ms.dao.UsuarioPortalDAO;
import pe.mil.ejercito.ms.model.Usuario;
import pe.mil.ejercito.ms.services.UsuarioPortalService;

@Service
public class UsuarioPortalServiceImpl implements UsuarioPortalService{

	@Autowired
	private UsuarioPortalDAO usuarioPortalDAO;

	@Override
	public List<Usuario> listarTodos(){
		return usuarioPortalDAO.listarTodos();
	}
}
