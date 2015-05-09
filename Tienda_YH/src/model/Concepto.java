package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Concepto.findAll", query="SELECT c FROM Concepto c")
public class Concepto {

	public Concepto(){
		
	}
	
	public Concepto(int id_concepto,String nombre,boolean estado){
		
		this.id_Concepto=id_concepto;
		this.Nombre=nombre;
		this.Estado=estado;
		
	}
	
	@Id
	private int id_Concepto;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Estado")
	private boolean Estado;
	
	
	public int getId_Concepto() {
		return id_Concepto;
	}
	public void setId_Concepto(int id_Concepto) {
		this.id_Concepto = id_Concepto;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public boolean isEstado() {
		return Estado;
	}
	public void setEstado(boolean estado) {
		Estado = estado;
	}
	
	
}
