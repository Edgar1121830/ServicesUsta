package co.com.servicios.dto;

import java.io.Serializable;

import co.com.servicios.modelo.Ingreso;
import co.com.servicios.modelo.Institucione;
import co.com.servicios.modelo.Opcion;
import co.com.servicios.modelo.Persona;
import co.com.servicios.modelo.Personaopcion;
import co.com.servicios.modelo.Rol;




public class UsuariosDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Persona persona;
	private Ingreso ingreso;
	private Opcion opciones;
	private Rol rol;
	private Personaopcion personaOpcion;
	private Institucione instituciones;
	private  String mensaje;



	public UsuariosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UsuariosDTO(Persona persona, Ingreso ingreso, Opcion opciones, Rol rol, Personaopcion personaOpcion,
			Institucione instituciones) {
		super();
		this.persona = persona;
		this.ingreso = ingreso;
		this.opciones = opciones;
		this.rol = rol;
		this.personaOpcion = personaOpcion;
		this.instituciones = instituciones;
	}



	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	public Ingreso getIngreso() {
		return ingreso;
	}



	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}



	public Opcion getOpciones() {
		return opciones;
	}



	public void setOpciones(Opcion opciones) {
		this.opciones = opciones;
	}



	public Rol getRol() {
		return rol;
	}



	public void setRol(Rol rol) {
		this.rol = rol;
	}



	public Personaopcion getPersonaOpcion() {
		return personaOpcion;
	}



	public void setPersonaOpcion(Personaopcion personaOpcion) {
		this.personaOpcion = personaOpcion;
	}



	public Institucione getInstituciones() {
		return instituciones;
	}



	public void setInstituciones(Institucione instituciones) {
		this.instituciones = instituciones;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
