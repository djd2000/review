package com.udacity.jwdnd1.c1.review.config;

import com.udacity.jwdnd1.c1.review.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CaseChangeConfig {
    
    @Bean
    public String upperCaseMessage(MessageService messageService){
        System.out.println("Creating upperCaseMessage Bean");
        return messageService.uppercase();
    }

    @Bean
    public String lowerCaseMessage(MessageService messageService){
        System.out.println("Creating lowerCaseMessage bean");
        return messageService.lowercase();
    }
}
