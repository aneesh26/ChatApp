package com.chatapp.model;

import java.util.HashMap;

public class RestData {
	HashMap<String,Object> clientData = new HashMap<String,Object>();
	HashMap<String,Object> serverData = new HashMap<String,Object>();
	public HashMap<String, Object> getClientData() {
		return clientData;
	}
	public void setClientData(HashMap<String, Object> clientData) {
		this.clientData = clientData;
	}
	public HashMap<String, Object> getServerData() {
		return serverData;
	}
	public void setServerData(HashMap<String, Object> serverData) {
		this.serverData = serverData;
	}

}
