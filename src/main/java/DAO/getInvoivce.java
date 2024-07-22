package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Models.Invoice;
import Models.LineItem;
import Models.Product;


public class getInvoivce {
	public List<LineItem> getInvoices() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banxe3");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<LineItem> invoices = new ArrayList<LineItem>();
		
		try {
			String queryString = "SELECT u FROM Invoice u";
            Query query = entityManager.createQuery(queryString);
            
            invoices = query.getResultList();
            return invoices;
            
        } catch (Exception e) {
            // process sql exception
        	e.printStackTrace();
        }
		return null;
	}
}
