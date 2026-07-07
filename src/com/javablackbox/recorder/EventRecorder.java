package com.javablackbox.recorder;

import com.javablackbox.events.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRecorder {
	
	private final List<Event> events;
	
	public EventRecorder() {
		this.events = new ArrayList<>();
	}
	
	public void record(Event event) {
		this.events.add(event);
	}
	
	public List<Event> getEvents() {
		return this.events;
	}
	
	public void clear() {
		this.events.clear();
	}
	
}
