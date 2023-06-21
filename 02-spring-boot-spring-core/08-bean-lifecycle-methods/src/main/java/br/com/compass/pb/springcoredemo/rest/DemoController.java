package br.com.compass.pb.springcoredemo.rest;

import br.com.compass.pb.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    //define init method

    @PostConstruct
    public void doStart(){
        System.out.println("In doStart: " + getClass().getSimpleName());
    }


    //define destroy method
    @PreDestroy
    public void doDestroy(){
        System.out.println("In doDestroy: " + getClass().getSimpleName());
    }


    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }



}
