package br.com.compass.pb.springcoredemo.config;

import br.com.compass.pb.springcoredemo.common.Coach;
import br.com.compass.pb.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }


}
