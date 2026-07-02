package com.javablackbox.events;

// EventCategory is an enum class defining all the different valid categories any given event can be
public enum EventCategory {
	AUTHENTICATION,
	USER_ACTION,
	SYSTEM,
	FILE,
	DATABASE,
	NETWORK,
	SECURTIY,
	ERROR,
	DEBUG,
	// Custom is a miscellaneous category for anything that may not fit into the others
	CUSTOM
}