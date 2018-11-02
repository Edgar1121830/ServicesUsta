package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the opcionrecurso database table.
 * 
 */
@Embeddable
public class OpcionrecursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codopcionpretarea;

	@Column(insertable=false, updatable=false)
	private int codrecursopreta;

	public OpcionrecursoPK() {
	}
	public int getCodopcionpretarea() {
		return this.codopcionpretarea;
	}
	public void setCodopcionpretarea(int codopcionpretarea) {
		this.codopcionpretarea = codopcionpretarea;
	}
	public int getCodrecursopreta() {
		return this.codrecursopreta;
	}
	public void setCodrecursopreta(int codrecursopreta) {
		this.codrecursopreta = codrecursopreta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OpcionrecursoPK)) {
			return false;
		}
		OpcionrecursoPK castOther = (OpcionrecursoPK)other;
		return 
			(this.codopcionpretarea == castOther.codopcionpretarea)
			&& (this.codrecursopreta == castOther.codrecursopreta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codopcionpretarea;
		hash = hash * prime + this.codrecursopreta;
		
		return hash;
	}
}