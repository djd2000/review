package com.udacity.jwdnd1.c1.review.services;



import com.udacity.jwdnd1.c1.review.Message;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {

    private String message;

    public MessageService(String message) {
        this.message = message;
    }

    public String uppercase(){
        return this.message.toUpperCase();
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating MessageService bean");
    }

}
