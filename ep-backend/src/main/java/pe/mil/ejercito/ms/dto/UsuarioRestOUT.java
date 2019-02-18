package pe.mil.ejercito.ms.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import pe.mil.ejercito.ms.model.Usuario;

public class UsuarioRestOUT implements Serializable{
	
	private static final long serialVersionUID = -8756967975242541198L;
	
	private Long id;
	private String nickname;
	
	
	/**
	 * Permite convertir un objeto Usuario a UsuarioRestOUT
	 * @param domain Objeto Usuario
	 * @return El objeto convertido en UsuarioRestOUT
	 */
	public static UsuarioRestOUT parseToUsuarioRestOUT( Usuario domain ) {
		
		if( domain==null ) {
			return null;
		}
		
		UsuarioRestOUT uRestOUT = new UsuarioRestOUT();
		// Copia las propiedades de un objeto a otro
		BeanUtils.copyProperties(domain, uRestOUT);
		
		return uRestOUT;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
