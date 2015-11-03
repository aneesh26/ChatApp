package com.chatapp.model;

import java.util.Arrays;
import java.util.Date;

public class ChatTranscript {
	ChatMessage[] listOfMessages;
	@Override
	public String toString() {
		return "ChatTranscript [listOfMessages=" + Arrays.toString(listOfMessages) + ", chatType=" + chatType + "]";
	}
	public ChatTranscript(ChatMessage[] listOfMessages, int chatType) {
		super();
		this.listOfMessages = listOfMessages;
		this.chatType = chatType;
	}
	public ChatMessage[] getListOfMessages() {
		return listOfMessages;
	}
	public void setListOfMessages(ChatMessage[] listOfMessages) {
		this.listOfMessages = listOfMessages;
	}
	public int getChatType() {
		return chatType;
	}
	public void setChatType(int chatType) {
		this.chatType = chatType;
	}
	int chatType; //1 for One-One, 2 for Group Chat 

}
