package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Categoria_Producto.findAll", query="SELECT c FROM Categoria_Producto c")
public class Categoria_Producto {
	
	public Categoria_Producto(){
		
	}
	
	public Categoria_Producto(int id_categoria,String nombre,String descripcion){
		
		this.id_Categoria=id_categoria;
		this.Nombre=nombre;
		this.Descripcion=descripcion;
	}
	
	@Id
	private int id_Categoria;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Descripcion")
	private String Descripcion;
	
	public int getId_Categoria() {
		return id_Categoria;
	}
	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	

}
