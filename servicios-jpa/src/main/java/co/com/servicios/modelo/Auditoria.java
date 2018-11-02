package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the auditoria database table.
 * 
 */
@Entity
@NamedQuery(name="Auditoria.findAll", query="SELECT a FROM Auditoria a")
public class Auditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codauditoria;

	private int codingreso;

	@Lob
	private String detalle;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Time hora;

	public Auditoria() {
	}

	public int getCodauditoria() {
		return this.codauditoria;
	}

	public void setCodauditoria(int codauditoria) {
		this.codauditoria = codauditoria;
	}

	public int getCodingreso() {
		return this.codingreso;
	}

	public void setCodingreso(int codingreso) {
		this.codingreso = codingreso;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

}