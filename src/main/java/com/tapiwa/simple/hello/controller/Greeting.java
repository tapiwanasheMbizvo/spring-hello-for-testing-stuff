package com.tapiwa.simple.hello.controller;

import java.time.LocalDateTime;

public class Greeting {
    
    private String greeting;
    private LocalDateTime localDateTime;
    private String message;

    public Greeting() {
    }

    public Greeting(String greeting, LocalDateTime localDateTime, String messString) {
        this.greeting = greeting;
        this.localDateTime = localDateTime;
        this.message = messString;
    }


    public String getGreeting() {
        return this.greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public LocalDateTime getLocalDateTime() {
        return this.localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
            " greeting='" + getGreeting() + "'" +
            ", localDateTime='" + getLocalDateTime() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }


}
