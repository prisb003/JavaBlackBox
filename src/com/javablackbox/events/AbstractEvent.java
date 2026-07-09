package com.javablackbox.events;

import java.time.Instant;
import java.util.UUID;

public abstract class AbstractEvent  implements Event {
	// Initialize fields used for all events
	private final UUID id;
    private final Instant timestamp;
    private final EventCategory category;
    
    // Constructor. Protected as developers should be guided toward using the framework correctly
    protected AbstractEvent(EventCategory category) {
    	this.category = category;
    	this.timestamp = Instant.now();
    	this.id = UUID.randomUUID();
    }
    
    @Override
    public UUID getId() {
    	return this.id;
    }

    @Override
    public Instant getTimeStamp() {
    	return this.timestamp;
    }

    @Override
    public String getName() {
    	return getClass().getSimpleName();
    }

    @Override
    public EventCategory getCategory() {
    	return this.category;
    }
    @Override
    public String toString() {
		return getName() + "{id=" + getId() + ", timestamp=" + getTimeStamp() + ", category=" + getCategory() + "}";
    }
}