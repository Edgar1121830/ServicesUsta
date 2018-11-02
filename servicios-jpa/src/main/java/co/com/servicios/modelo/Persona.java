package co.com.servicios.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String CONSULTAR_USUARIO="Persona.CONSULTAR_USUARIO";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codpersona;

	private String apellidos;

	private String clave;

	private int codinstitucion;

	private int codrol;

	private String correo;

	private String direccion;

	private String documento;

	@Temporal(TemporalType.DATE)
	private Date fechaexpediciondocumento;

	private String fotointerna;

	private String fotopublica;

	private short genero;

	private String nombres;

	private String tamannofoto;

	private String telefono;

	private String tipodocumento;

	private String tipofoto;

	private String usuario;

	public Persona() {
	}

	public int getCodpersona() {
		return this.codpersona;
	}

	public void setCodpersona(int codpersona) {
		this.codpersona = codpersona;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getCodinstitucion() {
		return this.codinstitucion;
	}

	public void setCodinstitucion(int codinstitucion) {
		this.codinstitucion = codinstitucion;
	}

	public int getCodrol() {
		return this.codrol;
	}

	public void setCodrol(int codrol) {
		this.codrol = codrol;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getFechaexpediciondocumento() {
		return this.fechaexpediciondocumento;
	}

	public void setFechaexpediciondocumento(Date fechaexpediciondocumento) {
		this.fechaexpediciondocumento = fechaexpediciondocumento;
	}

	public String getFotointerna() {
		return this.fotointerna;
	}

	public void setFotointerna(String fotointerna) {
		this.fotointerna = fotointerna;
	}

	public String getFotopublica() {
		return this.fotopublica;
	}

	public void setFotopublica(String fotopublica) {
		this.fotopublica = fotopublica;
	}

	public short getGenero() {
		return this.genero;
	}

	public void setGenero(short genero) {
		this.genero = genero;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTamannofoto() {
		return this.tamannofoto;
	}

	public void setTamannofoto(String tamannofoto) {
		this.tamannofoto = tamannofoto;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getTipofoto() {
		return this.tipofoto;
	}

	public void setTipofoto(String tipofoto) {
		this.tipofoto = tipofoto;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}