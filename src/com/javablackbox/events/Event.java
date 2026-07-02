// Use events package and import libraries for globally unique IDs and storing time stamps as objects not strings
package com.javablackbox.events;

import java.time.Instant;
import java.util.UUID;

public interface Event {
	// Every event has an ID, Timestamp, Name and Category
	UUID getId();
	
	Instant getTimeStamp();
	
	String getName();
	
	EventCategory getCategory();
}
