package com.chatapp.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chatapp.model.ChatMessage;
import com.chatapp.model.ChatUser;

@Controller

@RequestMapping("/test")

public class RestController {

	ChatUser sender = new ChatUser("User 1","Active",12345,"sender@chat.com");
	ChatUser receiver = new ChatUser("User 2","Active",123456,"receiver@chat.com");
	ChatMessage newMessage = new ChatMessage("Test Message",new Date(0),sender,receiver);
	
	@RequestMapping(value = "/message", method=RequestMethod.GET, produces = {"application/json"} )
	@ResponseBody
	public ChatMessage getMessage(){
		return newMessage;
	}
	
	
}
