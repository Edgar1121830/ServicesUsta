package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opcion database table.
 * 
 */
@Entity
@NamedQuery(name="Opcion.findAll", query="SELECT o FROM Opcion o")
public class Opcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codopcion;

	private String codigo;

	private String enlace;

	private String estilo;

	private String icono;

	private String marco;

	private String nombreopcion;

	private int padre;

	private short posicion;

	public Opcion() {
	}

	public int getCodopcion() {
		return this.codopcion;
	}

	public void setCodopcion(int codopcion) {
		this.codopcion = codopcion;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEnlace() {
		return this.enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public String getEstilo() {
		return this.estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getMarco() {
		return this.marco;
	}

	public void setMarco(String marco) {
		this.marco = marco;
	}

	public String getNombreopcion() {
		return this.nombreopcion;
	}

	public void setNombreopcion(String nombreopcion) {
		this.nombreopcion = nombreopcion;
	}

	public int getPadre() {
		return this.padre;
	}

	public void setPadre(int padre) {
		this.padre = padre;
	}

	public short getPosicion() {
		return this.posicion;
	}

	public void setPosicion(short posicion) {
		this.posicion = posicion;
	}

}