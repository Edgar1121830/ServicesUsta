package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cuadroautoevaluacion database table.
 * 
 */
@Embeddable
public class CuadroautoevaluacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codnivel;

	@Column(insertable=false, updatable=false)
	private int codhabilidad;

	public CuadroautoevaluacionPK() {
	}
	public int getCodnivel() {
		return this.codnivel;
	}
	public void setCodnivel(int codnivel) {
		this.codnivel = codnivel;
	}
	public int getCodhabilidad() {
		return this.codhabilidad;
	}
	public void setCodhabilidad(int codhabilidad) {
		this.codhabilidad = codhabilidad;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CuadroautoevaluacionPK)) {
			return false;
		}
		CuadroautoevaluacionPK castOther = (CuadroautoevaluacionPK)other;
		return 
			(this.codnivel == castOther.codnivel)
			&& (this.codhabilidad == castOther.codhabilidad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codnivel;
		hash = hash * prime + this.codhabilidad;
		
		return hash;
	}
}