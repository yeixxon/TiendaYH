package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura {
	
	public Factura(){
		
	}
	
	public Factura(int id_factura,int id_cliente,String fecha,int id_pago){
		
		this.id_factura=id_factura;
		this.id_Cliente=id_cliente;
		this.fecha=fecha;
		this.id_Pago=id_pago;
			
	}
	
	@Id
	private int id_factura;
	
	@Column(name="id_Cliente")
	private int id_Cliente;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="id_Pago")
	private int id_Pago;
	
	
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getId_Pago() {
		return id_Pago;
	}
	public void setId_Pago(int id_Pago) {
		this.id_Pago = id_Pago;
	}

	
}
