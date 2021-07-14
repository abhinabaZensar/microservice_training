package com.spring;

import java.util.List;
import java.util.Map;

public class User {
	
	private String userName;
	
	private List<String> messages;

	private Map<String, String> homeMap;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public Map<String, String> getHomeMap() {
		return homeMap;
	}

	public void setHomeMap(Map<String, String> homeMap) {
		this.homeMap = homeMap;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", messages=" + messages + ", homeMap=" + homeMap + "]";
	}

	public User(String userName, List<String> messages, Map<String, String> homeMap) {
		super();
		this.userName = userName;
		this.messages = messages;
		this.homeMap = homeMap;
	}

	public User() {
		super();
	}

	

	
	

	
	
}
