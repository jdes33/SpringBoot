package com.jasonds.springcoredemo.rest;

import com.jasonds.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    // the Autowired tells spring to inject a dependency
    // note if we only have one constructor then @Autowired on ctor is option
    @Autowired
    public DemoController(Coach aCoach) {
        myCoach = aCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
