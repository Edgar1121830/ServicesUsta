package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opcionespreguntastareas database table.
 * 
 */
@Entity
@Table(name="opcionespreguntastareas")
@NamedQuery(name="Opcionespreguntastarea.findAll", query="SELECT o FROM Opcionespreguntastarea o")
public class Opcionespreguntastarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codopcionpretarea;

	private int codpreguntatarea;

	private String nombreopcionpreta;

	private String txtcorrecta;

	private int valor;

	public Opcionespreguntastarea() {
	}

	public int getCodopcionpretarea() {
		return this.codopcionpretarea;
	}

	public void setCodopcionpretarea(int codopcionpretarea) {
		this.codopcionpretarea = codopcionpretarea;
	}

	public int getCodpreguntatarea() {
		return this.codpreguntatarea;
	}

	public void setCodpreguntatarea(int codpreguntatarea) {
		this.codpreguntatarea = codpreguntatarea;
	}

	public String getNombreopcionpreta() {
		return this.nombreopcionpreta;
	}

	public void setNombreopcionpreta(String nombreopcionpreta) {
		this.nombreopcionpreta = nombreopcionpreta;
	}

	public String getTxtcorrecta() {
		return this.txtcorrecta;
	}

	public void setTxtcorrecta(String txtcorrecta) {
		this.txtcorrecta = txtcorrecta;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}