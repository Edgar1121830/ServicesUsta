package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reportetareas database table.
 * 
 */
@Entity
@Table(name="reportetareas")
@NamedQuery(name="Reportetarea.findAll", query="SELECT r FROM Reportetarea r")
public class Reportetarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReportetareaPK id;

	private int estadotarea;

	private float resultado;

	public Reportetarea() {
	}

	public ReportetareaPK getId() {
		return this.id;
	}

	public void setId(ReportetareaPK id) {
		this.id = id;
	}

	public int getEstadotarea() {
		return this.estadotarea;
	}

	public void setEstadotarea(int estadotarea) {
		this.estadotarea = estadotarea;
	}

	public float getResultado() {
		return this.resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

}