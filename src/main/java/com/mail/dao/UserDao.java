package com.mail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mail.components.User;
import com.mysql.cj.Query;

public class UserDao extends GenericDAO {
	
	
//	public User findUserByEmail(String email) {
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MailSystem");
//		EntityManager em =  null;
//		try {
//			em = emf.createEntityManager();
//			
//			Query q = em.createQuery("Select u from USER u WHERE u.userEmail  :email");
//				
//			
//			return obj;
//		}finally {
//			emf.close();
//			em.close();
//		}
//		return null;
//	}
}
