package br.com.compass.pb.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for 15minutes ";
    }

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
