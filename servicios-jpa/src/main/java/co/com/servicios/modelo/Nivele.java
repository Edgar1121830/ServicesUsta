package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the niveles database table.
 * 
 */
@Entity
@Table(name="niveles")
@NamedQuery(name="Nivele.findAll", query="SELECT n FROM Nivele n")
public class Nivele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codnivel;

	@Lob
	private String descripcion;

	private String nombrenivel;

	private String nombrenivelextendido;

	private int tipousuario;

	public Nivele() {
	}

	public int getCodnivel() {
		return this.codnivel;
	}

	public void setCodnivel(int codnivel) {
		this.codnivel = codnivel;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombrenivel() {
		return this.nombrenivel;
	}

	public void setNombrenivel(String nombrenivel) {
		this.nombrenivel = nombrenivel;
	}

	public String getNombrenivelextendido() {
		return this.nombrenivelextendido;
	}

	public void setNombrenivelextendido(String nombrenivelextendido) {
		this.nombrenivelextendido = nombrenivelextendido;
	}

	public int getTipousuario() {
		return this.tipousuario;
	}

	public void setTipousuario(int tipousuario) {
		this.tipousuario = tipousuario;
	}

}