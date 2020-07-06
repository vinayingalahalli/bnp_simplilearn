package com.hello.demo.service;

import java.util.List;

import com.hello.demo.model.Message;

public interface MessageService {

	public Message createMessage(Message message);
	public Message getMessageById(int id);
	public Message updateMessage(Message message);
	public void deleteMessage(int id);
	public List<Message> getAllMessages();
}
