package co.com.servicios.dto;

import java.io.Serializable;
import java.util.List;

import co.com.servicios.modelo.Fas;
import co.com.servicios.modelo.Nivele;
import co.com.servicios.modelo.Tarea;
import co.com.servicios.modelo.Unidade;
import co.com.servicios.modelo.Unidadhabilidad;




public class CursosVerDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<Nivele> niveles;
	private List<Unidade> unidades;
	private Unidadhabilidad unidadHabilidad;
	private List<Fas> fases;
	private List<Tarea> tareas;

	
	public CursosVerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CursosVerDTO(List<Nivele> niveles, List<Unidade> unidades, Unidadhabilidad unidadHabilidad, List<Fas> fases,
			List<Tarea> tareas) {
		super();
		this.niveles = niveles;
		this.unidades = unidades;
		this.unidadHabilidad = unidadHabilidad;
		this.fases = fases;
		this.tareas = tareas;
	}


	public List<Nivele> getNiveles() {
		return niveles;
	}


	public void setNiveles(List<Nivele> niveles) {
		this.niveles = niveles;
	}


	public List<Unidade> getUnidades() {
		return unidades;
	}


	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}


	public Unidadhabilidad getUnidadHabilidad() {
		return unidadHabilidad;
	}


	public void setUnidadHabilidad(Unidadhabilidad unidadHabilidad) {
		this.unidadHabilidad = unidadHabilidad;
	}


	public List<Fas> getFases() {
		return fases;
	}


	public void setFases(List<Fas> fases) {
		this.fases = fases;
	}


	public List<Tarea> getTareas() {
		return tareas;
	}


	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}


}