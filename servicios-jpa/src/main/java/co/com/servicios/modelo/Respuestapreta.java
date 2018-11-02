package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the respuestapreta database table.
 * 
 */
@Entity
@NamedQuery(name="Respuestapreta.findAll", query="SELECT r FROM Respuestapreta r")
public class Respuestapreta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespuestapretaPK id;

	@Lob
	private String txtrespuesta;

	public Respuestapreta() {
	}

	public RespuestapretaPK getId() {
		return this.id;
	}

	public void setId(RespuestapretaPK id) {
		this.id = id;
	}

	public String getTxtrespuesta() {
		return this.txtrespuesta;
	}

	public void setTxtrespuesta(String txtrespuesta) {
		this.txtrespuesta = txtrespuesta;
	}

}