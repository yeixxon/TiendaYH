package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Detalle_Factura.findAll", query="SELECT d FROM Detalle_Factura d")
public class Detalle_Factura {

	public Detalle_Factura(){
		
	}
	
	public Detalle_Factura(int id_detalle,int id_factura,int id_producto,String cantidad,String precio){
		
		this.id_Detalle=id_detalle;
		this.id_Factura=id_factura;
		this.id_Producto=id_producto;
		this.Cantida=cantidad;
		this.Precio=precio;
	}
	
	@Id
	private int id_Detalle;
	
	@Column(name="id_Factura")
	private int id_Factura;
	
	@Column(name="id_Producto")
	private int id_Producto;
	
	@Column(name="Cantida")
	private String Cantida;
	
	@Column(name="Precio")
	private String Precio;
	
	public int getId_Detalle() {
		return id_Detalle;
	}
	public void setId_Detalle(int id_Detalle) {
		this.id_Detalle = id_Detalle;
	}
	public int getId_Factura() {
		return id_Factura;
	}
	public void setId_Factura(int id_Factura) {
		this.id_Factura = id_Factura;
	}
	public int getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}
	public String getCantida() {
		return Cantida;
	}
	public void setCantida(String cantida) {
		Cantida = cantida;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	

}
