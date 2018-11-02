package co.com.servicios.modelo;

import java.io.Serializable;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ingreso database table.
 * 
 */
@Entity
@NamedQuery(name="Ingreso.findAll", query="SELECT i FROM Ingreso i")
public class Ingreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codingreso;

	private int codpersona;

	private String direccionip;

	@Temporal(TemporalType.DATE)
	private Date fecha;

//	private TimerTask hora;

	public Ingreso() {
	}

	public int getCodingreso() {
		return this.codingreso;
	}

	public void setCodingreso(int codingreso) {
		this.codingreso = codingreso;
	}

	public int getCodpersona() {
		return this.codpersona;
	}

	public void setCodpersona(int codpersona) {
		this.codpersona = codpersona;
	}

	public String getDireccionip() {
		return this.direccionip;
	}

	public void setDireccionip(String direccionip) {
		this.direccionip = direccionip;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

//	public TimerTask getHora() {
//		return this.hora;
//	}
//
//	public void setHora(TimerTask hora) {
//		this.hora = hora;
//	}

}