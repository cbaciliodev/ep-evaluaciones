package pe.mil.ejercito.ms.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import pe.mil.ejercito.ms.model.Usuario;

public class UsuarioRestIN implements Serializable{
	
	private static final long serialVersionUID = -8756967975242541198L;
	
	private String nickname;
	private String password;
	private String nombres;
	private String apellidos;
	
	public Usuario toUsuario() {
		Usuario u = new Usuario();
		BeanUtils.copyProperties(this, u);
		return u;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
}
