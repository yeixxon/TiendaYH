package data;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Usuario;

public class DataUsuario {
	
	public DataUsuario(){
		
	}

	 
	public boolean Guardar(Usuario objUser) throws SQLException{
		
		EntityManager em = null;
		Conexion con = new Conexion();
		Query q = null;
		List<?> list;
		boolean respuesta = false;
		try {
			em = con.Conectar();
			q = em.createNativeQuery("execute pa_guardarusuario ?,?,?,?,?,?,?,?,?,?,?,?,?,?")
			.setParameter(1, objUser.getDocumento())
			.setParameter(2, objUser.getNombre_1())
			.setParameter(3, objUser.getNombre_2())
			.setParameter(4, objUser.getApellido_1())
			.setParameter(5, objUser.getApellido_2())
			.setParameter(6, objUser.getDireccion())
			.setParameter(7, objUser.getTelefono())
			.setParameter(8, objUser.getCelular())
			.setParameter(9, objUser.getEmail())
			.setParameter(10, objUser.getFecha_Nacimiento())
			.setParameter(11, objUser.getSexo())
			.setParameter(12, objUser.getEstado_Civil())
			.setParameter(13, objUser.getUsuario())
			.setParameter(14, objUser.getPassword());
			//list = q.getResultList();
			respuesta = true;
			return respuesta;
		} catch (Exception e) {
			e.printStackTrace();
			return respuesta;
		}finally{
			em.close();
			con=null;
		}
		
	}
	
	public boolean Eliminar(Usuario objUser){
			
			EntityManager em = null;
			Conexion con = new Conexion();
			try {
				em = con.Conectar();
				em.getTransaction().begin();
				em.remove(objUser);
				em.getTransaction().commit();
				return true;
			} catch (Exception e) {
				em.getTransaction().rollback();
				e.printStackTrace();
				return false;
			}finally{
				em.close();
				con=null;
			}
			
		}
	
	public List<?> ConsultarTodos(){
			
			EntityManager em = null;
			Conexion con = new Conexion();
			Query q = null;
			List<?> lista= null;
			try {				
				em = con.Conectar();
				q = em.createNativeQuery("exec pa_consultarUsuario");
				lista = q.getResultList();
				return lista;
			} catch (Exception e) {
				e.printStackTrace();
				return lista;
			}finally{
				em.close();
				con=null;
			}
			
		}
	
	public List<?> Consultar(Usuario objUs){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		List<?> lista= null;
		Query q;
		try {				
			em = con.Conectar();
			q = em.createNativeQuery("exec pa_loginUsuario ?,?",Usuario.class)
			.setParameter(1, objUs.getEmail())
			.setParameter(2, objUs.getPassword());
			lista = q.getResultList();
			System.out.println(lista);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
			return lista;
		}finally{
			em.close();
			con=null;
		}
		
	}

}
