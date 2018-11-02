package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fases database table.
 * 
 */
@Entity
@Table(name="fases")
@NamedQuery(name="Fas.findAll", query="SELECT f FROM Fas f")
public class Fas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codfase;

	private int codunihab;

	@Lob
	private String descripcionfase;

	@Lob
	private String instrucciones;

	private String nombrefase;

	private int orden;

	public Fas() {
	}

	public int getCodfase() {
		return this.codfase;
	}

	public void setCodfase(int codfase) {
		this.codfase = codfase;
	}

	public int getCodunihab() {
		return this.codunihab;
	}

	public void setCodunihab(int codunihab) {
		this.codunihab = codunihab;
	}

	public String getDescripcionfase() {
		return this.descripcionfase;
	}

	public void setDescripcionfase(String descripcionfase) {
		this.descripcionfase = descripcionfase;
	}

	public String getInstrucciones() {
		return this.instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getNombrefase() {
		return this.nombrefase;
	}

	public void setNombrefase(String nombrefase) {
		this.nombrefase = nombrefase;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

}