/**
 * 
 */
package com.springrestcrud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestcrud.h2.dto.User;

/**
 * @author elena-01
 *
 */
public interface UserDAO extends JpaRepository<User,Long> {

}
