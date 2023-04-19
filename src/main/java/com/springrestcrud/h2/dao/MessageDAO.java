/**
 * 
 */
package com.springrestcrud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestcrud.h2.dto.Message;

/**
 * @author elena-01
 *
 */
public interface MessageDAO extends JpaRepository<Message, Long>{

}
