package com.chatapp.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chatapp.dao.MessageDAO;
import com.chatapp.model.ChatMessage;
import com.chatapp.model.ChatUser;
import com.chatapp.model.Message;
import com.chatapp.model.RestData;

@Controller

@RequestMapping("/test")



public class RestController {
	RestData restData;
	
	@Autowired
	MessageDAO messageDao;

	ChatUser sender = new ChatUser("User 1","Active","12345","sender@chat.com");
	ChatUser receiver = new ChatUser("User 2","Active","123456","receiver@chat.com");
	ChatMessage newMessage = new ChatMessage("Test Message from Server",new Date(0),sender,receiver);
	
	@RequestMapping(value = "/message", method=RequestMethod.GET, produces = {"application/json"} )
	@ResponseBody
	public RestData getMessage(){
		restData = new RestData();
		restData.getServerData().put("message", newMessage);
		
		List<Message> list = messageDao.getAllMessages();
		
		for(Message msg : list){
			System.out.println(msg.toString());
		}
		
		
		return restData;
	}
	
	
}
