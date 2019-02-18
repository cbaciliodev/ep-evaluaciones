package pe.mil.ejercito.ms.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.UsuarioDAO;
import pe.mil.ejercito.ms.dto.UsuarioRestIN;
import pe.mil.ejercito.ms.dto.UsuarioRestOUT;
import pe.mil.ejercito.ms.model.Usuario;
import pe.mil.ejercito.ms.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Override
	public List<Usuario> findAll(){
		return usuarioDao.list();
	}
	
	@Override
	public List<UsuarioRestOUT> findAllDTO(){
		List<Usuario> uList = findAll();
		
		if( uList==null || uList.isEmpty() ) {
			return null;
		}
		
		List<UsuarioRestOUT> uRestOutList = new ArrayList<>();
		for( Usuario u : uList ) {
			uRestOutList.add( UsuarioRestOUT.parseToUsuarioRestOUT(u) );
		}
		
		return uRestOutList;
	}
	
	public Usuario obtenerUsuarioByNickname( String nickname ) {
		return usuarioDao.obtenerUsuarioByNickname(nickname);
	}
	
	public boolean validarUsuario( String nickname, String password ) {
		return usuarioDao.validarUsuario(nickname, password);
	}
	
	public UsuarioRestOUT guardarUsuario( UsuarioRestIN usuarioRest ) {
		
		Usuario usuario = usuarioRest.toUsuario();
		usuarioDao.guardarUsuario(usuario);
		return UsuarioRestOUT.parseToUsuarioRestOUT(usuario);
		
	}
}





























