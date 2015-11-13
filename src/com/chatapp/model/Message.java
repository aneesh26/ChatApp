package com.chatapp.model;

import java.sql.Date;

public class Message {
	String message;
	String sentTime;
	String fromUserId;
	String toUserId;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSentTime() {
		return sentTime;
	}

	public void setSentTime(String sentTime) {
		this.sentTime = sentTime;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public Message(String message, String sentTime, String fromUserId,
			String toUserId) {
		super();
		this.message = message;
		this.sentTime = sentTime;
		this.fromUserId = fromUserId;
		this.toUserId = toUserId;
	}

	public Message() {
		super();
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", sentTime=" + sentTime
				+ ", fromUserId=" + fromUserId + ", toUserId=" + toUserId + "]";
	}

}
