package com.udacity.jwdnd1.c1.review.services;

import com.udacity.jwdnd1.c1.review.domain.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {

    private String message;
    List<ChatMessage> chatMessageList;

    public MessageService(String message) {
        this.message = message;
    }

    public String uppercase(){
        return this.message.toUpperCase();
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

    public void addMessage(ChatMessage message){
        chatMessageList.add(message);
    }

    @PostConstruct
    public void postConstruct(){
        chatMessageList = new ArrayList<>();
        System.out.println("Creating MessageService bean");
    }

    public List<ChatMessage> getMessages() {
        return chatMessageList;
    }
}
