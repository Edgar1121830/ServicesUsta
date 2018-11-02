package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personaopcion database table.
 * 
 */
@Entity
@NamedQuery(name="Personaopcion.findAll", query="SELECT p FROM Personaopcion p")
public class Personaopcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonaopcionPK id;

	public Personaopcion() {
	}

	public PersonaopcionPK getId() {
		return this.id;
	}

	public void setId(PersonaopcionPK id) {
		this.id = id;
	}

}