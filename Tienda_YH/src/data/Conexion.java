package data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
	
	public Conexion(){
		
	}

	public EntityManager Conectar(){
		
		EntityManager em=null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tienda_YH");
			em = emf.createEntityManager();
			return em;
		} catch (Exception e) {
			e.printStackTrace();
			return em;
		}

	}

}
