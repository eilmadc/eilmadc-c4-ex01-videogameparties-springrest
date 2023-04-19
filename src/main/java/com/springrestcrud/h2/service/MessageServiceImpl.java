/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestcrud.h2.dao.MessageDAO;
import com.springrestcrud.h2.dto.Message;

/**
 * @author elena-01
 *
 */

@Service
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	MessageDAO messageDAO;

	@Override
	public List<Message> listMessages() {
		// TODO Auto-generated method stub
		return messageDAO.findAll();
	}

	@Override
	public Message saveMessage(Message message) {
		// TODO Auto-generated method stub
		return messageDAO.save(message);
	}

	@Override
	public Message getMessageById(Long id) {
		// TODO Auto-generated method stub
		return messageDAO.findById(id).get();
	}

	@Override
	public Message updateMessage(Message message) {
		// TODO Auto-generated method stub
		return messageDAO.save(message);
	}

	@Override
	public void deleteMessage(Long id) {
		// TODO Auto-generated method stub
		messageDAO.deleteById(id);
	}
	

}
