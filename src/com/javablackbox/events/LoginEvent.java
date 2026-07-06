package com.javablackbox.events;

public class LoginEvent extends AbstractEvent {
	
	private final String username;
	
	// Constructor will align the invent within its given category
	public LoginEvent(String username) {
		super(EventCategory.AUTHENTICATION);
		this.username = username;
	}
	public String getUsername() {
		return this.username;
	}
}	
