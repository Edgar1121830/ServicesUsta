package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unidades database table.
 * 
 */
@Entity
@Table(name="unidades")
@NamedQuery(name="Unidade.findAll", query="SELECT u FROM Unidade u")
public class Unidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codunidad;

	private int codnivel;

	private String nombreunidad;

	private int orden;

	private String titulo;

	public Unidade() {
	}

	public int getCodunidad() {
		return this.codunidad;
	}

	public void setCodunidad(int codunidad) {
		this.codunidad = codunidad;
	}

	public int getCodnivel() {
		return this.codnivel;
	}

	public void setCodnivel(int codnivel) {
		this.codnivel = codnivel;
	}

	public String getNombreunidad() {
		return this.nombreunidad;
	}

	public void setNombreunidad(String nombreunidad) {
		this.nombreunidad = nombreunidad;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}