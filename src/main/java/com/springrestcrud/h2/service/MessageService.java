/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import com.springrestcrud.h2.dto.Message;

/**
 * @author elena-01
 *
 */
public interface MessageService {
	
	/* CRUD Methods */
	public List<Message> listMessages(); //List All
	
	public Message saveMessage(Message message); //Save an 
	
	public Message getMessageById(Long id);//Read Data
	
	public Message updateMessage(Message message);// Update Data
	
	public void deleteMessage(Long id);	// Delete 
}
