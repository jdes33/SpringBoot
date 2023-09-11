package com.jasonds.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // mark the class a spring bean to make and makes it available for dependency injection
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :)";
    }
}
