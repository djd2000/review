package com.udacity.jwdnd1.c1.review.config;

import com.udacity.jwdnd1.c1.review.domain.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public String message(){
        System.out.println("Creating message bean");
        return new Message().toString();
    }



}
