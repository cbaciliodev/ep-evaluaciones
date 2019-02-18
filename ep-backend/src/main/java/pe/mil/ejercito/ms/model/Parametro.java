package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EP_PARAMETRO")
public class Parametro {

	@Column(name = "VPAR_GRUPO")
	private String grupo;

	@Id
	@Column( name="NPAR_ID" )
	private Long id;
	
	@Column(name = "VPAR_NOMBRE")
	private String nombre;

	@Column(name = "VPAR_ALIAS")
	private String alias;

	@Column(name = "NPAR_KEY")
	private Long key;

	@Column(name = "VPAR_VALOR_TEXTO")
	private String valorTexto;

	@Column(name = "NPAR_VALOR_NUMERO")
	private Long ValorNumero;

	@Column(name = "CPAR_ESTADO")
	private String estado;

	@Column(name = "NPAR_KEY_PADRE")
	private Long keyPadre;

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getValorTexto() {
		return valorTexto;
	}

	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}

	public Long getValorNumero() {
		return ValorNumero;
	}

	public void setValorNumero(Long valorNumero) {
		ValorNumero = valorNumero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getKeyPadre() {
		return keyPadre;
	}

	public void setKeyPadre(Long keyPadre) {
		this.keyPadre = keyPadre;
	}

}
