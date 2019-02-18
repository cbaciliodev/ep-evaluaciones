package pe.mil.ejercito.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.model.Usuario;

@Repository
public interface UsuarioDAO {
	
	public List<Usuario> list();
	
	public Usuario obtenerUsuarioByNickname( String nickname );
	
	public boolean validarUsuario( String nickname, String password );
	
	public Usuario guardarUsuario(Usuario usuario);
}
