package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the preguntastarea database table.
 * 
 */
@Entity
@NamedQuery(name="Preguntastarea.findAll", query="SELECT p FROM Preguntastarea p")
public class Preguntastarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codpreguntatarea;

	private int codtarea;

	private int orden;

	@Lob
	private String textopreguntatarea;

	@Lob
	private String textopreguntatareacod;

	public Preguntastarea() {
	}

	public int getCodpreguntatarea() {
		return this.codpreguntatarea;
	}

	public void setCodpreguntatarea(int codpreguntatarea) {
		this.codpreguntatarea = codpreguntatarea;
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

	public String getTextopreguntatarea() {
		return this.textopreguntatarea;
	}

	public void setTextopreguntatarea(String textopreguntatarea) {
		this.textopreguntatarea = textopreguntatarea;
	}

	public String getTextopreguntatareacod() {
		return this.textopreguntatareacod;
	}

	public void setTextopreguntatareacod(String textopreguntatareacod) {
		this.textopreguntatareacod = textopreguntatareacod;
	}

}