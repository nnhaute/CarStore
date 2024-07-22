package DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Models.Customer;

public class loginCusDao {
    public Customer onLogin(Customer onlogin) throws ClassNotFoundException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banxe3");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            String queryString = "SELECT u FROM Customer u WHERE u.userName = :username AND u.passwd = :password";
            Query query = entityManager.createQuery(queryString);
            query.setParameter("username", onlogin.getUserName());
            query.setParameter("password", onlogin.getPasswd());

            Customer customer = (Customer) query.getSingleResult();
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//          
        }

        return null;
    }
}