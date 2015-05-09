package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="cuenta_Usuario.findAll", query="SELECT c FROM cuenta_Usuario c")
public class cuenta_Usuario {
	
	public cuenta_Usuario(){
		
	}
	
	public cuenta_Usuario(int id_cliente,String usuario,String password,String usuario_rol){
		
		this.id_Cliente=id_cliente;
		this.usuario=usuario;
		this.password=password;
		this.usuario_rol=usuario_rol;
	}
	
	@Id
	private int id_Cliente;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="usuario_rol")
	private String usuario_rol;
	
	
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
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
