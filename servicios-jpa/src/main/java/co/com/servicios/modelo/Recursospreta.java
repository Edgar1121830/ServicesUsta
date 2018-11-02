package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the recursospreta database table.
 * 
 */
@Entity
@NamedQuery(name="Recursospreta.findAll", query="SELECT r FROM Recursospreta r")
public class Recursospreta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codrecursopreta;

	private String nombreprivado;

	private String nombrepublico;

	private String tamanno;

	private String tiporecurso;

	public Recursospreta() {
	}

	public int getCodrecursopreta() {
		return this.codrecursopreta;
	}

	public void setCodrecursopreta(int codrecursopreta) {
		this.codrecursopreta = codrecursopreta;
	}

	public String getNombreprivado() {
		return this.nombreprivado;
	}

	public void setNombreprivado(String nombreprivado) {
		this.nombreprivado = nombreprivado;
	}

	public String getNombrepublico() {
		return this.nombrepublico;
	}

	public void setNombrepublico(String nombrepublico) {
		this.nombrepublico = nombrepublico;
	}

	public String getTamanno() {
		return this.tamanno;
	}

	public void setTamanno(String tamanno) {
		this.tamanno = tamanno;
	}

	public String getTiporecurso() {
		return this.tiporecurso;
	}

	public void setTiporecurso(String tiporecurso) {
		this.tiporecurso = tiporecurso;
	}

}