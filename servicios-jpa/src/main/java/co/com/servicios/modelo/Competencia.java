package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the competencias database table.
 * 
 */
@Entity
@Table(name="competencias")
@NamedQuery(name="Competencia.findAll", query="SELECT c FROM Competencia c")
public class Competencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codcompetencia;

	private String nombrecompetencia;

	public Competencia() {
	}

	public int getCodcompetencia() {
		return this.codcompetencia;
	}

	public void setCodcompetencia(int codcompetencia) {
		this.codcompetencia = codcompetencia;
	}

	public String getNombrecompetencia() {
		return this.nombrecompetencia;
	}

	public void setNombrecompetencia(String nombrecompetencia) {
		this.nombrecompetencia = nombrecompetencia;
	}

}