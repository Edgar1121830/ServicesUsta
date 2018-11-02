package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the habilidades database table.
 * 
 */
@Entity
@Table(name="habilidades")
@NamedQuery(name="Habilidade.findAll", query="SELECT h FROM Habilidade h")
public class Habilidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codhabilidad;

	private int codcompetencia;

	private String nombrehabilidad;

	public Habilidade() {
	}

	public int getCodhabilidad() {
		return this.codhabilidad;
	}

	public void setCodhabilidad(int codhabilidad) {
		this.codhabilidad = codhabilidad;
	}

	public int getCodcompetencia() {
		return this.codcompetencia;
	}

	public void setCodcompetencia(int codcompetencia) {
		this.codcompetencia = codcompetencia;
	}

	public String getNombrehabilidad() {
		return this.nombrehabilidad;
	}

	public void setNombrehabilidad(String nombrehabilidad) {
		this.nombrehabilidad = nombrehabilidad;
	}

}