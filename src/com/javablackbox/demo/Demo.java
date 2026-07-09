package com.javablackbox.demo;

import com.javablackbox.events.LoginEvent;
import com.javablackbox.recorder.EventRecorder;

public class Demo {

    public static void main(String[] args) {

        EventRecorder recorder = new EventRecorder();

        LoginEvent login = new LoginEvent("Sam");

        recorder.record(login);

        System.out.println(login);

        System.out.println(recorder.getEvents());

    }

}
