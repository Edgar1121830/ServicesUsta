package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opcionrecurso database table.
 * 
 */
@Entity
@NamedQuery(name="Opcionrecurso.findAll", query="SELECT o FROM Opcionrecurso o")
public class Opcionrecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OpcionrecursoPK id;

	public Opcionrecurso() {
	}

	public OpcionrecursoPK getId() {
		return this.id;
	}

	public void setId(OpcionrecursoPK id) {
		this.id = id;
	}

}