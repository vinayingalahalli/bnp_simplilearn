package com.hello.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.demo.model.Message;
import com.hello.demo.service.MessageService;

@RestController
public class MessageController  {

	@Autowired
	private MessageService service;
	
	@PostMapping("/message")
	public Message createMessage(@RequestBody Message message) {
		
		return service.createMessage(message);
	}

	@GetMapping("/message/{id}")
	public Message getMessageById(@PathVariable("id") int id) {
		
		return service.getMessageById(id);
	}

	@PutMapping("/message")
	public Message updateMessage(@RequestBody Message message) {
	
		return service.updateMessage(message);
	}

	@DeleteMapping("/message/{id}")
	public void deleteMessage(@PathVariable("id") int id) {
		service.deleteMessage(id);
		
	}

	@GetMapping("/messages")
	public List<Message> getAllMessages() {
		
		return service.getAllMessages();
	}

	
}
