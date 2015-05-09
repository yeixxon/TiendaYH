package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import controller.ControllerUsuario;

@Path("Usuarios")
public class RestUsuario {
	
	@POST
	@Path("Guardar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Guardar(@QueryParam("data") String data){
		
		ControllerUsuario objUser = new ControllerUsuario();
		boolean respuesta =false;
		try {
			respuesta=objUser.Guardar(data);
			return respuesta;
		} catch (Exception e) {
			return respuesta;
		}
	}
	
	@POST
	@Path("ConsultarTodos")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<?> ConsultarTodos(){
		
		ControllerUsuario objUser = new ControllerUsuario();
		ArrayList<?> list = null;
		try {
			list=objUser.ConsultarTodos();
			return list;
		} catch (Exception e) {
			return list;
		}
	}
	
	@POST
	@Path("Consultar")
    @Produces(MediaType.APPLICATION_JSON)
    public List<?> Consultar(@QueryParam("email") String email,@QueryParam("pw") String pw){
		
		ControllerUsuario objUser = new ControllerUsuario();
		List<?> list = null;
		try {
			list=objUser.Consultar(email,pw);
			return list;
		} catch (Exception e) {
			return list;
		}
	}
	
	@POST
	@Path("Eliminar")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean Eliminar(@QueryParam("n1") int number1) {
		return true;
	}

}
