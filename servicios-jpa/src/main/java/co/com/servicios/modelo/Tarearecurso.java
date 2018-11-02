package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tarearecurso database table.
 * 
 */
@Entity
@NamedQuery(name="Tarearecurso.findAll", query="SELECT t FROM Tarearecurso t")
public class Tarearecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TarearecursoPK id;

	private int orden;

	public Tarearecurso() {
	}

	public TarearecursoPK getId() {
		return this.id;
	}

	public void setId(TarearecursoPK id) {
		this.id = id;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

}