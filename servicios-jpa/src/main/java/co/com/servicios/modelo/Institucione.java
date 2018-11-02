package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the instituciones database table.
 * 
 */
@Entity
@Table(name="instituciones")
@NamedQuery(name="Institucione.findAll", query="SELECT i FROM Institucione i")
public class Institucione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codinstitucion;

	private int codpadre;

	private String correo;

	private String direccion;

	private String nombreinstitucion;

	private String telefono;

	private int tipoinstitucion;

	public Institucione() {
	}

	public int getCodinstitucion() {
		return this.codinstitucion;
	}

	public void setCodinstitucion(int codinstitucion) {
		this.codinstitucion = codinstitucion;
	}

	public int getCodpadre() {
		return this.codpadre;
	}

	public void setCodpadre(int codpadre) {
		this.codpadre = codpadre;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreinstitucion() {
		return this.nombreinstitucion;
	}

	public void setNombreinstitucion(String nombreinstitucion) {
		this.nombreinstitucion = nombreinstitucion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getTipoinstitucion() {
		return this.tipoinstitucion;
	}

	public void setTipoinstitucion(int tipoinstitucion) {
		this.tipoinstitucion = tipoinstitucion;
	}

}