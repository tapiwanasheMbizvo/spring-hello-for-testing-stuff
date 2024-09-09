package com.tapiwa.simple.hello.controller;

import java.time.LocalDateTime;

public class Greeting {
    
    private String greeting;
    private LocalDateTime localDateTime;

    public Greeting() {
    }

    public Greeting(String greeting, LocalDateTime localDateTime) {
        this.greeting = greeting;
        this.localDateTime = localDateTime;
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

    @Override
    public String toString() {
        return "{" +
            " greeting='" + getGreeting() + "'" +
            ", localDateTime='" + getLocalDateTime() + "'" +
            "}";
    }


}
