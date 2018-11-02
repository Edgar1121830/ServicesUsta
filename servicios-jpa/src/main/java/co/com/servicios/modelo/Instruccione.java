package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the instrucciones database table.
 * 
 */
@Entity
@Table(name="instrucciones")
@NamedQuery(name="Instruccione.findAll", query="SELECT i FROM Instruccione i")
public class Instruccione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codinstruccion;

	private int codtarea;

	private int orden;

	private String textoinstruccion;

	public Instruccione() {
	}

	public int getCodinstruccion() {
		return this.codinstruccion;
	}

	public void setCodinstruccion(int codinstruccion) {
		this.codinstruccion = codinstruccion;
	}

	public int getCodtarea() {
		return this.codtarea;
	}

	public void setCodtarea(int codtarea) {
		this.codtarea = codtarea;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getTextoinstruccion() {
		return this.textoinstruccion;
	}

	public void setTextoinstruccion(String textoinstruccion) {
		this.textoinstruccion = textoinstruccion;
	}

}