package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tareas database table.
 * 
 */
@Entity
@Table(name="tareas")
@NamedQuery(name="Tarea.findAll", query="SELECT t FROM Tarea t")
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codtarea;

	private int codfase;

	@Lob
	private String detalle;

	private int orden;

	private int tipotarea;

	private String titulo;

	public Tarea() {
	}

	public int getCodtarea() {
		return this.codtarea;
	}

	public void setCodtarea(int codtarea) {
		this.codtarea = codtarea;
	}

	public int getCodfase() {
		return this.codfase;
	}

	public void setCodfase(int codfase) {
		this.codfase = codfase;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getTipotarea() {
		return this.tipotarea;
	}

	public void setTipotarea(int tipotarea) {
		this.tipotarea = tipotarea;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}