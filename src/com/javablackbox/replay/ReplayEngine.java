package com.javablackbox.replay;

import com.javablackbox.events.Event;
import com.javablackbox.recorder.EventRecorder;

public class ReplayEngine {

	private final EventRecorder recorder;

    public ReplayEngine(EventRecorder recorder) {
    	this.recorder = recorder;
    }

    public void replay() {
    	for (Event event : recorder.getEvents()) {
    		System.out.println(event);
    	}
    }

}