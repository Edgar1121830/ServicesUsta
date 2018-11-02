package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the preguntaseva database table.
 * 
 */
@Entity
@NamedQuery(name="Preguntaseva.findAll", query="SELECT p FROM Preguntaseva p")
public class Preguntaseva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codpregunta;

	private int codevaluacion;

	private String textopregunta;

	public Preguntaseva() {
	}

	public int getCodpregunta() {
		return this.codpregunta;
	}

	public void setCodpregunta(int codpregunta) {
		this.codpregunta = codpregunta;
	}

	public int getCodevaluacion() {
		return this.codevaluacion;
	}

	public void setCodevaluacion(int codevaluacion) {
		this.codevaluacion = codevaluacion;
	}

	public String getTextopregunta() {
		return this.textopregunta;
	}

	public void setTextopregunta(String textopregunta) {
		this.textopregunta = textopregunta;
	}

}