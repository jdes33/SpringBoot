package com.jasonds.springcoredemo.rest;

import com.jasonds.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // no need to use @Qualifer even tho there are several implementations of the coach interface..
    // ,  it will no which to pick as we have marked the TrackCoach class as @Primary
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
