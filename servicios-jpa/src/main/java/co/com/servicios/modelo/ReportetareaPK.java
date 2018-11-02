package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the reportetareas database table.
 * 
 */
@Embeddable
public class ReportetareaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codinscripcion;

	@Column(insertable=false, updatable=false)
	private int codtarea;

	public ReportetareaPK() {
	}
	public int getCodinscripcion() {
		return this.codinscripcion;
	}
	public void setCodinscripcion(int codinscripcion) {
		this.codinscripcion = codinscripcion;
	}
	public int getCodtarea() {
		return this.codtarea;
	}
	public void setCodtarea(int codtarea) {
		this.codtarea = codtarea;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReportetareaPK)) {
			return false;
		}
		ReportetareaPK castOther = (ReportetareaPK)other;
		return 
			(this.codinscripcion == castOther.codinscripcion)
			&& (this.codtarea == castOther.codtarea);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codinscripcion;
		hash = hash * prime + this.codtarea;
		
		return hash;
	}
}