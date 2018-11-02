package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opcionespreguntaseva database table.
 * 
 */
@Entity
@NamedQuery(name="Opcionespreguntaseva.findAll", query="SELECT o FROM Opcionespreguntaseva o")
public class Opcionespreguntaseva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codopcionpreguntaeva;

	private int codpregunta;

	private String nombreopcionpreeva;

	private int valor;

	public Opcionespreguntaseva() {
	}

	public int getCodopcionpreguntaeva() {
		return this.codopcionpreguntaeva;
	}

	public void setCodopcionpreguntaeva(int codopcionpreguntaeva) {
		this.codopcionpreguntaeva = codopcionpreguntaeva;
	}

	public int getCodpregunta() {
		return this.codpregunta;
	}

	public void setCodpregunta(int codpregunta) {
		this.codpregunta = codpregunta;
	}

	public String getNombreopcionpreeva() {
		return this.nombreopcionpreeva;
	}

	public void setNombreopcionpreeva(String nombreopcionpreeva) {
		this.nombreopcionpreeva = nombreopcionpreeva;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}