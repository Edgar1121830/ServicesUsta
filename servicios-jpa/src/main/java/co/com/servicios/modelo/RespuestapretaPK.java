package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the respuestapreta database table.
 * 
 */
@Embeddable
public class RespuestapretaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codinscripcion;

	@Column(insertable=false, updatable=false)
	private int codopcionpretarea;

	public RespuestapretaPK() {
	}
	public int getCodinscripcion() {
		return this.codinscripcion;
	}
	public void setCodinscripcion(int codinscripcion) {
		this.codinscripcion = codinscripcion;
	}
	public int getCodopcionpretarea() {
		return this.codopcionpretarea;
	}
	public void setCodopcionpretarea(int codopcionpretarea) {
		this.codopcionpretarea = codopcionpretarea;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespuestapretaPK)) {
			return false;
		}
		RespuestapretaPK castOther = (RespuestapretaPK)other;
		return 
			(this.codinscripcion == castOther.codinscripcion)
			&& (this.codopcionpretarea == castOther.codopcionpretarea);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codinscripcion;
		hash = hash * prime + this.codopcionpretarea;
		
		return hash;
	}
}