package rest;

import java.util.ArrayList;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import controller.ControllerProducto;

@Path("Producto")
public class RestProducto {
	
	@POST
	@Path("Guardar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Guardar(@QueryParam("data") String data){
		
		ControllerProducto objProd = new ControllerProducto();
		boolean respuesta =false;
		try {
			respuesta=objProd.Guardar(data);
			return respuesta;
		} catch (Exception e) {
			return respuesta;
		}
	}
	
	@POST
	@Path("ConsultarTodos")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<?> ConsultarTodos(){
		
		ControllerProducto objProd = new ControllerProducto();
		ArrayList<?> list = null;
		try {
			list=objProd.ConsultarTodos();
			return list;
		} catch (Exception e) {
			return list;
		}
	}
	
	@POST
	@Path("Consultar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Consultar(){
		
		ControllerProducto objProd = new ControllerProducto();
		boolean respuesta = false;
		try {
			respuesta=objProd.Consultar();
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
