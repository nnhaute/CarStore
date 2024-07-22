package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Models.Product;

public class getPrd {
	public List<Product> products() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banxe3");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Product> prds = new ArrayList<Product>();
		
		try {
			String queryString = "SELECT u FROM Product u";
            Query query = entityManager.createQuery(queryString);
            
            prds = query.getResultList();
            return prds;
            
        } catch (Exception e) {
            // process sql exception
        	e.printStackTrace();
        }
		return null;
	}
	
}
