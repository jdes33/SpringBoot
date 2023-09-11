package com.jasonds.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy // marked as lazy (tho now we globally marked all beans as lazy in properties file so this is redundant)
@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In ctor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
