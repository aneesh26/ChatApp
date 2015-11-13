package com.chatapp.model;

import java.sql.Date;

public class ChatMessage {
	public ChatMessage() {
		super();
	}

	String message;
	Date sentTime;
	ChatUser fromUser;
	ChatUser toUser;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSentTime() {
		return sentTime;
	}

	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}

	public ChatUser getFromUser() {
		return fromUser;
	}

	public void setFromUser(ChatUser fromUser) {
		this.fromUser = fromUser;
	}

	public ChatUser getToUser() {
		return toUser;
	}

	public void setToUser(ChatUser toUser) {
		this.toUser = toUser;
	}

	public ChatMessage(String message, Date sentTime, ChatUser fromUser, ChatUser toUser) {
		super();
		this.message = message;
		this.sentTime = sentTime;
		this.fromUser = fromUser;
		this.toUser = toUser;
	}

	@Override
	public String toString() {
		return "ChatMessage [message=" + message + ", sentTime=" + sentTime + ", fromUser=" + fromUser + ", toUser="
				+ toUser + "]";
	}

}
