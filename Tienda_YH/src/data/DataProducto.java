package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Producto;

public class DataProducto {
	
	public DataProducto(){
		
	}
	
	public boolean Guardar(Producto objProducto){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.persist(objProducto);
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
	
	public boolean Eliminar(Producto objProducto){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.remove(objProducto);
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
				q = em.createNativeQuery("select * from Producto");
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


}
