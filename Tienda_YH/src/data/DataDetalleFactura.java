package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Detalle_Factura;

public class DataDetalleFactura {
	
	public DataDetalleFactura(){
		
	}
	
	public boolean Guardar(Detalle_Factura objDetalleF){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.persist(objDetalleF);
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
	
	public boolean Eliminar(Detalle_Factura objDetalleF){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.remove(objDetalleF);
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
				q = em.createNativeQuery("select * from detalleFactura");
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
