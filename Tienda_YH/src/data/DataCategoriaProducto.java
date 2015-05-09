package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Categoria_Producto;

public class DataCategoriaProducto {
	
	public DataCategoriaProducto() {
		
	}
	
	public boolean Guardar(Categoria_Producto objCategoriaP){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.persist(objCategoriaP);
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
	
	public boolean Eliminar(Categoria_Producto objCategoriaP){
		
		EntityManager em = null;
		Conexion con = new Conexion();
		try {
			em = con.Conectar();
			em.getTransaction().begin();
			em.remove(objCategoriaP);
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
			q = em.createNativeQuery("select * from categoriaProducto");
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
