package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_TIPO_BREVETE")
public class TipoBrevete {
	
	@Id
//	@GeneratedValue(generator="SQ_TIPO_BREVETE")
//	@SequenceGenerator(name="SQ_TIPO_BREVETE",sequenceName="SQ_TIPO_BREVETE", allocationSize=5)
	@Column(name="NTIPOBREVETE_CODIGO")
	private String codigoTipoBrevete;
	
	@Column(name="VTIPOBREVETE_NOMBRE")
	private String nombreTipoBrevete;

	public String getCodigoTipoBrevete() {
		return codigoTipoBrevete;
	}

	public void setCodigoTipoBrevete(String codigoTipoBrevete) {
		this.codigoTipoBrevete = codigoTipoBrevete;
	}

	public String getNombreTipoBrevete() {
		return nombreTipoBrevete;
	}

	public void setNombreTipoBrevete(String nombreTipoBrevete) {
		this.nombreTipoBrevete = nombreTipoBrevete;
	}
	
		

}
