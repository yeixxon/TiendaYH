package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto {
	
	public Producto(){
		
	}
	
	public Producto(int id_producto,String nombre,String precio,String stock,int id_categoria){
			
		this.id_Producto=id_producto;
		this.Nombre=nombre;
		this.Precio=precio;
		this.Stock=stock;
		this.id_Categoria=id_categoria;
		
	}
	
	@Id
	private int id_Producto;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Precio")
	private String Precio;
	
	@Column(name="Stock")
	private String Stock;
	
	@Column(name="id_Categoria")
	private int id_Categoria;
	
	public int getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	public String getStock() {
		return Stock;
	}
	public void setStock(String stock) {
		Stock = stock;
	}
	public int getId_Categoria() {
		return id_Categoria;
	}
	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}
	
}
