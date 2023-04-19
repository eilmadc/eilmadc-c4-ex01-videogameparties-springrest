/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import com.springrestcrud.h2.dto.User;

/**
 * @author elena-01
 *
 */
public interface UserService {

	/* CRUD Methods */
	public List<User> listUsers(); //List All Users
	
	public User saveUser(User user); //Save an user - CREATE - POST
	
	public User getUserById(Long id);//Read Client Data READ
	
	public User updateUser(User user);// Update Data Client UPDATE
	
	public void deleteUser(Long id);	// Delete User DELETE
	
}
