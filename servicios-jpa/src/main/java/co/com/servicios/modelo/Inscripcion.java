package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inscripcion database table.
 * 
 */
@Entity
@NamedQuery(name="Inscripcion.findAll", query="SELECT i FROM Inscripcion i")
public class Inscripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codinscripcion;

	private int certificado;

	private int codinstitucion;

	private int codnivel;

	private int codpersona;

	private int estadoactual;

	private float porcentajeavance;

	public Inscripcion() {
	}

	public int getCodinscripcion() {
		return this.codinscripcion;
	}

	public void setCodinscripcion(int codinscripcion) {
		this.codinscripcion = codinscripcion;
	}

	public int getCertificado() {
		return this.certificado;
	}

	public void setCertificado(int certificado) {
		this.certificado = certificado;
	}

	public int getCodinstitucion() {
		return this.codinstitucion;
	}

	public void setCodinstitucion(int codinstitucion) {
		this.codinstitucion = codinstitucion;
	}

	public int getCodnivel() {
		return this.codnivel;
	}

	public void setCodnivel(int codnivel) {
		this.codnivel = codnivel;
	}

	public int getCodpersona() {
		return this.codpersona;
	}

	public void setCodpersona(int codpersona) {
		this.codpersona = codpersona;
	}

	public int getEstadoactual() {
		return this.estadoactual;
	}

	public void setEstadoactual(int estadoactual) {
		this.estadoactual = estadoactual;
	}

	public float getPorcentajeavance() {
		return this.porcentajeavance;
	}

	public void setPorcentajeavance(float porcentajeavance) {
		this.porcentajeavance = porcentajeavance;
	}

}