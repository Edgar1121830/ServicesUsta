package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the objetivos database table.
 * 
 */
@Entity
@Table(name="objetivos")
@NamedQuery(name="Objetivo.findAll", query="SELECT o FROM Objetivo o")
public class Objetivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codobjetivo;

	private int claseobjetivo;

	private int codunihab;

	@Lob
	private String texto;

	public Objetivo() {
	}

	public int getCodobjetivo() {
		return this.codobjetivo;
	}

	public void setCodobjetivo(int codobjetivo) {
		this.codobjetivo = codobjetivo;
	}

	public int getClaseobjetivo() {
		return this.claseobjetivo;
	}

	public void setClaseobjetivo(int claseobjetivo) {
		this.claseobjetivo = claseobjetivo;
	}

	public int getCodunihab() {
		return this.codunihab;
	}

	public void setCodunihab(int codunihab) {
		this.codunihab = codunihab;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}