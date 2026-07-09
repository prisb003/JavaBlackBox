package com.javablackbox.demo;

import com.javablackbox.events.LoginEvent;
import com.javablackbox.recorder.EventRecorder;
import com.javablackbox.replay.ReplayEngine;

public class Demo {

    public static void main(String[] args) {

    	EventRecorder recorder = new EventRecorder();

    	recorder.record(new LoginEvent("Sam"));
    	recorder.record(new LoginEvent("Alice"));
    	recorder.record(new LoginEvent("Charlie"));

    	ReplayEngine replay = new ReplayEngine(recorder);

    	System.out.println("=== Replay Start ===");
    	replay.replay();
    	System.out.println("=== Replay End ===");

    }

}
