package com.chatapp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chatapp.dao.MessageDAO;
import com.chatapp.model.Message;

public class TestApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:**/chatapp-beans.xml");

		MessageDAO message = (MessageDAO) context.getBean("messageDao");
		
		List<Message> list = message.getAllMessages();
		
		for(Message msg : list){
			msg.toString();
		}
//		System.out.println(message.toString());

		((ClassPathXmlApplicationContext)context).close();

	}
	

}
 