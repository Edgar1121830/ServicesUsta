package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codrol;

	private String nombrerol;

	public Rol() {
	}

	public int getCodrol() {
		return this.codrol;
	}

	public void setCodrol(int codrol) {
		this.codrol = codrol;
	}

	public String getNombrerol() {
		return this.nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

}