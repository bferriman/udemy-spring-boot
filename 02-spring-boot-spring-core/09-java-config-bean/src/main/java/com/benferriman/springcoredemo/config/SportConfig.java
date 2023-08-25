package com.benferriman.springcoredemo.config;

import com.benferriman.springcoredemo.common.Coach;
import com.benferriman.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
