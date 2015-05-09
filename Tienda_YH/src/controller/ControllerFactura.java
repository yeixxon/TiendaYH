package controller;

import java.util.ArrayList;
import java.util.List;

import model.Factura;

import org.codehaus.jackson.map.ObjectMapper;

import data.DataFactura;

public class ControllerFactura {
	
	public ControllerFactura(){
	
	}
	
	public boolean Guardar(String data){
		
		ObjectMapper objectMapper = new ObjectMapper();
		Factura objFact = new Factura();
		DataFactura objDFact = new DataFactura();
		boolean respuesta = false;
		try {
			objFact=objectMapper.readValue(data,Factura.class);
			respuesta = objDFact.Guardar(objFact);
			return respuesta;
		} catch (Exception e) {
			e.printStackTrace();
			return respuesta;
		}
		
	}
	
	public ArrayList<?> ConsultarTodos(){
			
			DataFactura objDFact = new DataFactura();
			List<?> lista = null;
			ArrayList<Factura> list = new ArrayList<Factura>();
			Object[] obj;
			try {
				lista = objDFact.ConsultarTodos();
				for (int i=0; i<lista.size(); i++){
					obj= (Object[]) lista.get(i);
					list.add(new Factura((int)obj[0], (int)obj[1], obj[2].toString(), (int)obj[3]));
				}			
				return list;
			} catch (Exception e) {
				e.printStackTrace();
				return list;
			}
			
	}
	
	public boolean Consultar(){
		
		DataFactura objDFact = new DataFactura();
		boolean respuesta = false;
		try {
			//respuesta = objDFact.Consultar();	
			return respuesta;
		} catch (Exception e) {
			e.printStackTrace();
			return respuesta;
		}
		
	}

}
