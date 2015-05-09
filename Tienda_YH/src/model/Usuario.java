package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the Usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario {
	
	public Usuario(){
		
	}
	
	public Usuario(int id,String doc,String nom1,String nom2,String ape1,String ape2,String dir,
			String tel,String cel,String emial,String fecha,String sexo,String estado,String usuario,String password,String usuario_rol){
		
		this.id_Cliente=id;
		this.documento=doc;
		this.nombre_1=nom1;
		this.nombre_2=nom2;
		this.apellido_1=ape1;
		this.apellido_2=ape2;
		this.direccion=dir;
		this.telefono=tel;
		this.celular=cel;
		this.email=emial;
		this.fecha_Nacimiento=fecha;
		this.sexo=sexo;
		this.estado_Civil=estado;
		this.usuario=usuario;
		this.password=password;
		this.usuario_rol=usuario_rol;
	}

	@Id
	private int id_Cliente;

	@Column(name="Apellido_1")
	private String apellido_1;

	@Column(name="Apellido_2")
	private String apellido_2;

	@Column(name="Celular")
	private String celular;

	@Column(name="Direccion")
	private String direccion;

	@Column(name="Documento")
	private String documento;

	@Column(name="Email")
	private String email;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="usuario_rol")
	private String usuario_rol;

	@Column(name="estado_Civil")
	private String estado_Civil;

	@Column(name="fecha_Nacimiento")
	private String fecha_Nacimiento;

	@Column(name="Nombre_1")
	private String nombre_1;

	@Column(name="Nombre_2")
	private String nombre_2;

	@Column(name="Sexo")
	private String sexo;

	@Column(name="Telefono")
	private String telefono;

	public int getId_Cliente() {
		return this.id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getApellido_1() {
		return this.apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return this.apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado_Civil() {
		return this.estado_Civil;
	}

	public void setEstado_Civil(String estado_Civil) {
		this.estado_Civil = estado_Civil;
	}

	public String getFecha_Nacimiento() {
		return this.fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getNombre_1() {
		return this.nombre_1;
	}

	public void setNombre_1(String nombre_1) {
		this.nombre_1 = nombre_1;
	}

	public String getNombre_2() {
		return this.nombre_2;
	}

	public void setNombre_2(String nombre_2) {
		this.nombre_2 = nombre_2;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario_rol() {
		return usuario_rol;
	}

	public void setUsuario_rol(String usuario_rol) {
		this.usuario_rol = usuario_rol;
	}
	
	

}