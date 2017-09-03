package com.booking.ticket.dao;

import java.util.List;

import com.booking.ticket.model.User;



public interface UserDao {
	
	public void save(User user);

	public void update(User user);

	public void delete(User user);

	public List<User> getAllUsers();

}
