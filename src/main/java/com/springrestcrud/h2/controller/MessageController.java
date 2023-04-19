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

import com.springrestcrud.h2.dto.Message;
import com.springrestcrud.h2.service.MessageServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class MessageController {
	@Autowired
	MessageServiceImpl messageServiceImpl;

	@GetMapping("/messages")
	public List<Message> listMessages() {
		return messageServiceImpl.listMessages();
	}

	@PostMapping("/messages")
	public Message saveMessage(@RequestBody Message message) {

		return messageServiceImpl.saveMessage(message);
	}

	@GetMapping("/messages/{id}")
	public Message messageById(@PathVariable(name = "id") Long id) {

		Message message_bid = new Message();

		message_bid = messageServiceImpl.getMessageById(id);

		System.out.println("Message XID: " + message_bid);

		return message_bid;
	}

	@PutMapping("/messages/{id}")
	public Message updateMessage(@PathVariable(name = "id") Long id, @RequestBody Message message) {

		Message message_selected = new Message();
		Message message_updated = new Message();

		message_selected = messageServiceImpl.getMessageById(id);

		message_selected.setMessage(message.getMessage());
		message_selected.setParty(message.getParty());
		message_selected.setUser(message.getUser());

		message_updated = messageServiceImpl.updateMessage(message_selected);

		System.out.println("The message updated is: " + message_updated);

		return message_updated;
	}

	@DeleteMapping("/messages/{id}")
	public void deleteMessage(@PathVariable(name = "id") Long id) {
		messageServiceImpl.deleteMessage(id);
	}

}
