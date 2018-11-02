package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the personaopcion database table.
 * 
 */
@Embeddable
public class PersonaopcionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codpersona;

	@Column(insertable=false, updatable=false)
	private int codopcion;

	public PersonaopcionPK() {
	}
	public int getCodpersona() {
		return this.codpersona;
	}
	public void setCodpersona(int codpersona) {
		this.codpersona = codpersona;
	}
	public int getCodopcion() {
		return this.codopcion;
	}
	public void setCodopcion(int codopcion) {
		this.codopcion = codopcion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PersonaopcionPK)) {
			return false;
		}
		PersonaopcionPK castOther = (PersonaopcionPK)other;
		return 
			(this.codpersona == castOther.codpersona)
			&& (this.codopcion == castOther.codopcion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codpersona;
		hash = hash * prime + this.codopcion;
		
		return hash;
	}
}