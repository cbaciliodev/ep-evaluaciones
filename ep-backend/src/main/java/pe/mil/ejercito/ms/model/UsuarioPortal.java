package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EP_USUARIO_PORTAL")
public class UsuarioPortal {

	@Id
	@Column(name = "VUSUARIO_CODIGO")
	private String usuarioCodigo;
	
	@Column(name = "CROL_CODIGO")
	private String rol;
	
	@ManyToOne
	@JoinColumn(name = "CNIVEL_CODIGO")
	private NivelPvu nivel;
	
	@ManyToOne
	@JoinColumn(name = "CPERFIL_CODIGO")
	private PerfilPvu perfil;
	
	@Column(name = "DUSUARIO_INICIO")
	private String inicio;
	
	@Column(name = "DUSUARIO_FIN")
	private String fin;
	
	@Column(name = "CUSUARIO_ESTADO")
	private String estado;
	
	@Column(name = "DUSUARIO_FECREG")
	private String fecReg;
	
	@Column(name = "VUSUARIO_USUARIO")
	private String usuario;

	@Column(name = "DUSUARIO_FECMOD")
	private String fecMod;
	
	@Column(name = "VUSUARIO_USUMOD")
	private String usuMod;
	
	@Column(name = "VUSUARIO_CLAVE")
	private String clave;

	public String getUsuarioCodigo() {
		return usuarioCodigo;
	}

	public void setUsuarioCodigo(String usuarioCodigo) {
		this.usuarioCodigo = usuarioCodigo;
	}

}
