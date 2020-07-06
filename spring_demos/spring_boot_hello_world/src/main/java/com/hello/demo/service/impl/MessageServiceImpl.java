package com.hello.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hello.demo.model.Message;
import com.hello.demo.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
private static Map<Integer, Message> map=new HashMap<>();
private static int count;
	@Override
	public Message createMessage(Message message) {
		message.setId(++count);
		map.put(message.getId(), message);
		return message;
	}

	@Override
	public Message getMessageById(int id) {
		
		return map.get(id);
	}

	@Override
	public Message updateMessage(Message message) {
		map.put(message.getId(), message);
		return message;
	}

	@Override
	public void deleteMessage(int id) {
		map.remove(id);
		
	}

	@Override
	public List<Message> getAllMessages() {
		
		return new ArrayList<>(map.values());
	}

}
