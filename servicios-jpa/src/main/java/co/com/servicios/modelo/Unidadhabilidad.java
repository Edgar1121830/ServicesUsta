package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unidadhabilidad database table.
 * 
 */
@Entity
@NamedQuery(name="Unidadhabilidad.findAll", query="SELECT u FROM Unidadhabilidad u")
public class Unidadhabilidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codunihab;

	private int codhabilidad;

	private int codunidad;

	public Unidadhabilidad() {
	}

	public int getCodunihab() {
		return this.codunihab;
	}

	public void setCodunihab(int codunihab) {
		this.codunihab = codunihab;
	}

	public int getCodhabilidad() {
		return this.codhabilidad;
	}

	public void setCodhabilidad(int codhabilidad) {
		this.codhabilidad = codhabilidad;
	}

	public int getCodunidad() {
		return this.codunidad;
	}

	public void setCodunidad(int codunidad) {
		this.codunidad = codunidad;
	}

}