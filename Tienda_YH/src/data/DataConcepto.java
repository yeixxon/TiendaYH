package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Concepto;;

public class DataConcepto {
	
	public DataConcepto() {
		
	}
	
	public boolean Guardar(Concepto objConcepto){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.persist(objConcepto);
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
	
	public boolean Eliminar(Concepto objConcepto){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.remove(objConcepto);
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
			q = em.createNativeQuery("select * from Concepto");
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
