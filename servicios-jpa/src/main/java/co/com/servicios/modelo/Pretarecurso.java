package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pretarecurso database table.
 * 
 */
@Entity
@NamedQuery(name="Pretarecurso.findAll", query="SELECT p FROM Pretarecurso p")
public class Pretarecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PretarecursoPK id;

	public Pretarecurso() {
	}

	public PretarecursoPK getId() {
		return this.id;
	}

	public void setId(PretarecursoPK id) {
		this.id = id;
	}

}