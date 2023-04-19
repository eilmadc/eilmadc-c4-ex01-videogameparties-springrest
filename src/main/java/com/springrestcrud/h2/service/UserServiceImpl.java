/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestcrud.h2.dao.UserDAO;
import com.springrestcrud.h2.dto.User;

/**
 * @author elena-01
 *
 */

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;

	@Override
	public List<User> listUsers() {
		return userDAO.findAll();
	}

	@Override
	public User saveUser(User user) {
		
		return userDAO.save(user);
	}

	@Override
	public User getUserById(Long id) {
		
		return userDAO.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		
		return userDAO.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		
		userDAO.deleteById(id);
	}

}
