package com.mail.service;

import java.time.LocalDateTime;
import java.util.List;

import com.mail.components.Mail;
import com.mail.components.User;
import com.mail.dao.UserDao;
import com.mail.exception.UserNotFoundException;

public class UserService {
	
	
	public User loginAuth(String email, String password) {
		
		
		return null;
	}
	
	
	public void sendMail(Mail mail,int fromUserId, int toUserId) {
		UserDao userDao = new UserDao();
		
		User fromUser =(User) userDao.findUserById(User.class, fromUserId);
		
		User toUser = (User) userDao.findUserById(User.class, toUserId);
		if(toUser == null) {
			throw new UserNotFoundException("User Not Found!!!");
		}
		else {
		Mail fromMail = new Mail();
		fromMail.setDateAndTime(LocalDateTime.now());
		fromMail.setMessage(mail.getMessage());
		fromMail.setSubject(mail.getSubject());
		fromMail.setType("SEND");
		fromMail.setUser(fromUser);
		userDao.save(fromMail);
		
		Mail toMail = new Mail();
		toMail.setDateAndTime(LocalDateTime.now());
		toMail.setMessage(mail.getMessage());
		toMail.setSubject(mail.getSubject());
		toMail.setType("RECEIVED");
		toMail.setUser(toUser);
		userDao.save(toMail);
		}
	}
	
	
	
	
	
	public void markImpMail(int mailId) {
		UserDao userDao = new UserDao();
		Mail mail =(Mail) userDao.findUserById(Mail.class, mailId);
		mail.setImportant(true);
		userDao.save(mail);
		
	}
	
	public void deleteMail(int mailId) {
		UserDao userDao = new UserDao();
		Mail mail =(Mail) userDao.findUserById(Mail.class, mailId);
		mail.setUser(null);
	}
	
	public List<Mail> findAllMailSent(int userId){
		UserDao userDao = new UserDao();
		
		User user =(User) userDao.findUserById(User.class, userId);
		
		
		return null;
	}
	
	public List<Mail> findAllMailReceived(){
		//logic
		return null;
	}
	
	
	
}
