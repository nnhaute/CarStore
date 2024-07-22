package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Models.Cart;

public class getLineItem {
	public List<Cart> getLItem(int customerID) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banxe3");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Cart> showLineItems = new ArrayList<>();
		
		try {
			String queryString = "SELECT carName, price, quantity "
		    		        + "FROM carmanegement.lineitem "
		    		        + "INNER JOIN carmanegement.product ON lineitem.item = product.carID "
		    		        + "INNER JOIN carmanegement.invoice ON lineitem.lineItemID = invoice.items AND invoice.status = 0 "
		    		        + "INNER JOIN carmanegement.customer ON invoice.invoiceID = customer.invoiceID AND customer.customerID = ?";
            Query query = entityManager.createQuery(queryString);
            

        } catch (Exception e) {
        	e.printStackTrace();
        }
		return showLineItems;
	}
}
