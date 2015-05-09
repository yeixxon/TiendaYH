package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Factura;

public class DataFactura {
	
	public DataFactura(){
		
	}
	
	public boolean Guardar(Factura objFactura){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.persist(objFactura);
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
	
	public boolean Eliminar(Factura objFactura){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.remove(objFactura);
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
				q = em.createNativeQuery("select * from Factura");
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
