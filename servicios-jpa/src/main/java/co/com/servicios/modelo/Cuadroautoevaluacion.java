package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cuadroautoevaluacion database table.
 * 
 */
@Entity
@NamedQuery(name="Cuadroautoevaluacion.findAll", query="SELECT c FROM Cuadroautoevaluacion c")
public class Cuadroautoevaluacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CuadroautoevaluacionPK id;

	private String descripcion;

	public Cuadroautoevaluacion() {
	}

	public CuadroautoevaluacionPK getId() {
		return this.id;
	}

	public void setId(CuadroautoevaluacionPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}