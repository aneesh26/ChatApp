package com.chatapp.model;

public class ChatUser {
	String name;

	public ChatUser(String name, String status, String contact, String email) {
		super();
		this.name = name;
		this.status = status;
		this.contact = contact;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ChatUser [name=" + name + ", status=" + status + ", contact=" + contact + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	String status;
	String contact;
	String email;

}
