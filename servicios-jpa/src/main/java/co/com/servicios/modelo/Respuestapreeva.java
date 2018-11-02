package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the respuestapreeva database table.
 * 
 */
@Entity
@NamedQuery(name="Respuestapreeva.findAll", query="SELECT r FROM Respuestapreeva r")
public class Respuestapreeva implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespuestapreevaPK id;

	public Respuestapreeva() {
	}

	public RespuestapreevaPK getId() {
		return this.id;
	}

	public void setId(RespuestapreevaPK id) {
		this.id = id;
	}

}