package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the respuestapreeva database table.
 * 
 */
@Embeddable
public class RespuestapreevaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codinscripcion;

	@Column(insertable=false, updatable=false)
	private int codopcionpreguntaeva;

	public RespuestapreevaPK() {
	}
	public int getCodinscripcion() {
		return this.codinscripcion;
	}
	public void setCodinscripcion(int codinscripcion) {
		this.codinscripcion = codinscripcion;
	}
	public int getCodopcionpreguntaeva() {
		return this.codopcionpreguntaeva;
	}
	public void setCodopcionpreguntaeva(int codopcionpreguntaeva) {
		this.codopcionpreguntaeva = codopcionpreguntaeva;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespuestapreevaPK)) {
			return false;
		}
		RespuestapreevaPK castOther = (RespuestapreevaPK)other;
		return 
			(this.codinscripcion == castOther.codinscripcion)
			&& (this.codopcionpreguntaeva == castOther.codopcionpreguntaeva);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codinscripcion;
		hash = hash * prime + this.codopcionpreguntaeva;
		
		return hash;
	}
}