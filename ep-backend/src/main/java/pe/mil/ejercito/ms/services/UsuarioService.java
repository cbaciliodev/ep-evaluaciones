package pe.mil.ejercito.ms.services;

import java.util.List;

import pe.mil.ejercito.ms.dto.UsuarioRestIN;
import pe.mil.ejercito.ms.dto.UsuarioRestOUT;
import pe.mil.ejercito.ms.model.Usuario;

public interface UsuarioService {
	
	public List<Usuario> findAll();
	
	public List<UsuarioRestOUT> findAllDTO();
	
	public Usuario obtenerUsuarioByNickname( String nickname );
	
	public boolean validarUsuario( String nickname, String password );
	
	public UsuarioRestOUT guardarUsuario( UsuarioRestIN usuarioRest );
}
