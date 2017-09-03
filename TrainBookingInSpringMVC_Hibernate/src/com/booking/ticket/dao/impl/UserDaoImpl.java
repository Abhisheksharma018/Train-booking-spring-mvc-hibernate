package com.booking.ticket.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.booking.ticket.dao.UserDao;
import com.booking.ticket.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	@Qualifier(value="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		//sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		
		session.save(user);
		
		//transaction.commit();
		
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		//transaction=session.beginTransaction();
		
		session.update(user);
		
		//transaction.commit();
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		//transaction=session.beginTransaction();
		
		session.delete(user);
		
	//	transaction.commit();
		
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub

		List<User> users = new ArrayList<User>();
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		//transaction=session.beginTransaction();
		
		Query query = session.createQuery("select *from TrainBooking_User");
		users.addAll(query.list());
		
		//transaction.commit();
		
		
		return users;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
