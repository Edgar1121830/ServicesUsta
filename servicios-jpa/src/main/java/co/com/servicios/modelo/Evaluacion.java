package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the evaluacion database table.
 * 
 */
@Entity
@NamedQuery(name="Evaluacion.findAll", query="SELECT e FROM Evaluacion e")
public class Evaluacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codevaluacion;

	private int codunihab;

	@Lob
	private String tituloeva;

	public Evaluacion() {
	}

	public int getCodevaluacion() {
		return this.codevaluacion;
	}

	public void setCodevaluacion(int codevaluacion) {
		this.codevaluacion = codevaluacion;
	}

	public int getCodunihab() {
		return this.codunihab;
	}

	public void setCodunihab(int codunihab) {
		this.codunihab = codunihab;
	}

	public String getTituloeva() {
		return this.tituloeva;
	}

	public void setTituloeva(String tituloeva) {
		this.tituloeva = tituloeva;
	}

}