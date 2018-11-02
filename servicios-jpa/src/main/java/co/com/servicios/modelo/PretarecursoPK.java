package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pretarecurso database table.
 * 
 */
@Embeddable
public class PretarecursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codpreguntatarea;

	@Column(insertable=false, updatable=false)
	private int codrecursopreta;

	public PretarecursoPK() {
	}
	public int getCodpreguntatarea() {
		return this.codpreguntatarea;
	}
	public void setCodpreguntatarea(int codpreguntatarea) {
		this.codpreguntatarea = codpreguntatarea;
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
		if (!(other instanceof PretarecursoPK)) {
			return false;
		}
		PretarecursoPK castOther = (PretarecursoPK)other;
		return 
			(this.codpreguntatarea == castOther.codpreguntatarea)
			&& (this.codrecursopreta == castOther.codrecursopreta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codpreguntatarea;
		hash = hash * prime + this.codrecursopreta;
		
		return hash;
	}
}