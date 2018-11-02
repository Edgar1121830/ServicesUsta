package co.com.servicios.dto;

import java.io.Serializable;
import java.util.List;

import co.com.servicios.modelo.Habilidade;
import co.com.servicios.modelo.Inscripcion;
import co.com.servicios.modelo.Instruccione;




public class CursosPermisosDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Inscripcion inscripciones;
	private List<Instruccione> instrucciones;
	private List<Habilidade> habilidades;


	public CursosPermisosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CursosPermisosDTO(Inscripcion inscripciones, List<Instruccione> instrucciones,
			List<Habilidade> habilidades) {
		super();
		this.inscripciones = inscripciones;
		this.instrucciones = instrucciones;
		this.habilidades = habilidades;
	}


	public Inscripcion getInscripciones() {
		return inscripciones;
	}


	public void setInscripciones(Inscripcion inscripciones) {
		this.inscripciones = inscripciones;
	}


	public List<Instruccione> getInstrucciones() {
		return instrucciones;
	}


	public void setInstrucciones(List<Instruccione> instrucciones) {
		this.instrucciones = instrucciones;
	}


	public List<Habilidade> getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}




	
}
