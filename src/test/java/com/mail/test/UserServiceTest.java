package com.mail.test;

import org.junit.Test;

import com.mail.components.Mail;
import com.mail.components.User;
import com.mail.dao.UserDao;
import com.mail.service.UserService;

public class UserServiceTest {

	@Test
	public void sendUser_test() {
		UserDao dao = new UserDao();
		
		UserService userService = new UserService();
//		Mail mail = new Mail();
//		mail.setMessage("Hii");
//		mail.setSubject("Greetings");
		
//		User user = new User();
//		user.setUserEmail("Pawan@gmail.com");
//		user.setUserName("Pawan");
//		user.setUserPassword("1234");
//		user.setAdmin(false);
//		
//		dao.save(user);
//		
//		User user2 = new User();
//		user2.setUserEmail("Samruddhi@gmail.com");
//		user2.setUserName("Samruddhi");
//		user2.setUserPassword("123");
//		user2.setAdmin(false);
//		dao.save(user2);
		
		Mail mail = new Mail();
		mail.setMessage("I am Fine!!");
		mail.setSubject("Reply");
		userService.sendMail(mail, 2, 3);
	}
	
}
