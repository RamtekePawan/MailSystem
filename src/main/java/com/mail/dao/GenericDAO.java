package com.mail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class GenericDAO {
	
	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MailSystem");		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.merge(obj);
			tx.commit();
			
		} finally {
			em.close();
			emf.close();
		}
	}
	
	
	public Object findUserById(Class cls, Object i) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MailSystem");
		EntityManager em =  null;
		try {
			em = emf.createEntityManager();
			
			Object obj = em.find(cls, i);
			
			return obj;
		}finally {
			emf.close();
			em.close();
		}
	}
}
