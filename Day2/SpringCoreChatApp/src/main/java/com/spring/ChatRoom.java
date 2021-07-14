package com.spring;

import java.util.List;

public class ChatRoom {
	
	private List<User> users;

	public ChatRoom(List<User> users) {
		super();
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "ChatRoom [users=" + users +"]";
	}

	public ChatRoom() {
		super();
	}
	
	

}
