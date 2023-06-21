package br.com.compass.pb.springcoredemo.rest;

import br.com.compass.pb.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

}
