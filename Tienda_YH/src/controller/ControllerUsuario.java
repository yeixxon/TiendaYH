package controller;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

import org.codehaus.jackson.map.ObjectMapper;

import data.DataUsuario;

public class ControllerUsuario {
	
	public ControllerUsuario(){
		
	}
	
	public boolean Guardar(String data){
		
		ObjectMapper objectMapper = new ObjectMapper();
		Usuario objUser = new Usuario();
		DataUsuario objDUser = new DataUsuario();
		boolean respuesta = false;
		try {
			objUser=objectMapper.readValue(data,Usuario.class);
			respuesta = objDUser.Guardar(objUser);
			return respuesta;
		} catch (Exception e) {
			e.printStackTrace();
			return respuesta;
		}
		
	}
	
	public ArrayList<?> ConsultarTodos(){
			
			DataUsuario objDUser = new DataUsuario();
			List<?> lista = null;
			ArrayList<Usuario> list = new ArrayList<Usuario>();
			Object[] obj;
			try {
				lista = objDUser.ConsultarTodos();
				for (int i=0; i<lista.size(); i++){
					obj= (Object[]) lista.get(i);
					list.add(new Usuario((int)obj[0], obj[1].toString(), obj[2].toString(), obj[3].toString(),
							obj[4].toString(), obj[5].toString(),obj[6].toString(), obj[7].toString(),
							obj[8].toString(), obj[9].toString(), obj[10].toString(),
							obj[11].toString(), obj[12].toString(),obj[13].toString(),obj[14].toString(),obj[15].toString()));
				}			
				return list;
			} catch (Exception e) {
				e.printStackTrace();
				return list;
			}
			
		}
	
	public List<?> Consultar(String email,String pw){
		
		DataUsuario objDUser = new DataUsuario();
		Usuario objUser = new Usuario();
		//ArrayList<?> lista = null;
		List<?> list = null;
		try {
			objUser.setEmail(email);
			objUser.setPassword(pw);
			list = objDUser.Consultar(objUser);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		
	}

}
