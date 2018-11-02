package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tarearecurso database table.
 * 
 */
@Embeddable
public class TarearecursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codtarea;

	@Column(insertable=false, updatable=false)
	private int codrecursopreta;

	public TarearecursoPK() {
	}
	public int getCodtarea() {
		return this.codtarea;
	}
	public void setCodtarea(int codtarea) {
		this.codtarea = codtarea;
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
		if (!(other instanceof TarearecursoPK)) {
			return false;
		}
		TarearecursoPK castOther = (TarearecursoPK)other;
		return 
			(this.codtarea == castOther.codtarea)
			&& (this.codrecursopreta == castOther.codrecursopreta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codtarea;
		hash = hash * prime + this.codrecursopreta;
		
		return hash;
	}
}