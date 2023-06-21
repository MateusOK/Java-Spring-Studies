package br.com.compass.pb.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30min in practice";
    }

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
