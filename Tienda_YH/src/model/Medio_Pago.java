package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name="Medio_Pago.findAll", query="SELECT m FROM Medio_Pago m")
public class Medio_Pago {
	
	public Medio_Pago(){
		
	}
	
	public Medio_Pago(int id_pago,int medio_pago,String otros_detalle){
		
		this.id_Pago=id_pago;
		this.medio_Pago=medio_pago;
		this.Otros_detalle=otros_detalle;
	}
	
	@Id
	private int id_Pago;
	
	@Column(name="medio_Pago")
	private int medio_Pago;
	
	@Column(name="Otros_detalle")
	private String Otros_detalle;
	
	public int getId_Pago() {
		return id_Pago;
	}
	public void setId_Pago(int id_Pago) {
		this.id_Pago = id_Pago;
	}
	public int getMedio_Pago() {
		return medio_Pago;
	}
	public void setMedio_Pago(int medio_Pago) {
		this.medio_Pago = medio_Pago;
	}
	public String getOtros_detalle() {
		return Otros_detalle;
	}
	public void setOtros_detalle(String otros_detalle) {
		Otros_detalle = otros_detalle;
	}
	
	


}
