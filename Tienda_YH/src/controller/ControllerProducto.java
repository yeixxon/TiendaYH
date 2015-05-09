package controller;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

import org.codehaus.jackson.map.ObjectMapper;

import data.DataProducto;

public class ControllerProducto {
	
	public ControllerProducto(){
		
	}

	
	public boolean Guardar(String data){
		
		ObjectMapper objectMapper = new ObjectMapper();
		Producto objDProd = new Producto();
		DataProducto objDUser = new DataProducto();
		boolean respuesta = false;
		try {
			objDProd=objectMapper.readValue(data,Producto.class);
			respuesta = objDUser.Guardar(objDProd);
			return respuesta;
		} catch (Exception e) {
			e.printStackTrace();
			return respuesta;
		}
		
	}
	
	public ArrayList<?> ConsultarTodos(){
			
			DataProducto objDProd = new DataProducto();
			List<?> lista = null;
			ArrayList<Producto> list = new ArrayList<Producto>();
			Object[] obj;
			try {
				lista = objDProd.ConsultarTodos();
				for (int i=0; i<lista.size(); i++){
					obj= (Object[]) lista.get(i);
					list.add(new Producto((int)obj[0], obj[1].toString(),obj[2].toString(),obj[3].toString(),
							(int)obj[4]));
				}			
				return list;
			} catch (Exception e) {
				e.printStackTrace();
				return list;
			}
			
	}
	
	public boolean Consultar(){
		
		DataProducto objDProd = new DataProducto();
		boolean respuesta = false;
		try {
		//	respuesta = objDProd.ConsultarTodos()
			return respuesta;
		} catch (Exception e) {
			e.printStackTrace();
			return respuesta;
		}
		
	}
}
