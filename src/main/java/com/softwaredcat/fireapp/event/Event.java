package com.softwaredcat.fireapp.event;

public class Event {

    private String message;

    public Event() {
    }

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
