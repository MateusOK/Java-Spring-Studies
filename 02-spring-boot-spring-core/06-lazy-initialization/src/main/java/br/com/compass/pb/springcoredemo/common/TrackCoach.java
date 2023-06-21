package br.com.compass.pb.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km!!!";
    }
    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

}