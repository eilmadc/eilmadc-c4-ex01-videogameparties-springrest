/**
 * 
 */
package com.springrestcrud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestcrud.h2.dto.User;
import com.springrestcrud.h2.service.UserServiceImpl;

/**
 * @author elena-01
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/users")
	public List<User> listUsers() {
		return userServiceImpl.listUsers();
	}

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}

	@GetMapping("/users/{id}")
	public User userByID(@PathVariable(name = "id") Long id) {

		User user_id = new User();
		user_id = userServiceImpl.getUserById(id);

		System.out.println("User By ID:" + user_id);

		return user_id;
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(name = "id") Long id, @RequestBody User user) {
		User user_selected = new User();
		User user_updated = new User();

		user_selected = userServiceImpl.getUserById(id);

		user_selected.setUsername(user.getUsername());
		user_selected.setEmail(user.getEmail());
		user_selected.setSteamprofile(user.getSteamprofile());
		user_selected.setDate_signin(user.getDate_signin());

		user_updated = userServiceImpl.updateUser(user_selected);

		return user;

	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable(name = "id") Long id) {
		userServiceImpl.deleteUser(id);
	}
}
