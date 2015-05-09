package rest;

import java.util.ArrayList;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import controller.ControllerFactura;

@Path("Factura")
public class RestFactura {
	
	@POST
	@Path("Guardar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Guardar(@QueryParam("data") String data){
		
		ControllerFactura objFact= new ControllerFactura();
		boolean respuesta =false;
		try {
			respuesta=objFact.Guardar(data);
			return respuesta;
		} catch (Exception e) {
			return respuesta;
		}
	}
	
	@POST
	@Path("ConsultarTodos")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<?> ConsultarTodos(){
		
		ControllerFactura objFact = new ControllerFactura();
		ArrayList<?> list = null;
		try {
			list=objFact.ConsultarTodos();
			return list;
		} catch (Exception e) {
			return list;
		}
	}
	
	@POST
	@Path("Consultar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Consultar(){
		
		ControllerFactura objFact = new ControllerFactura();
		boolean respuesta = false;
		try {
			respuesta=objFact.Consultar();
			return respuesta;
		} catch (Exception e) {
			return respuesta;
		}
	}
	
	@POST
	@Path("Eliminar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Eliminar(@QueryParam("n1") int number1) {
		return true;
	}

}
