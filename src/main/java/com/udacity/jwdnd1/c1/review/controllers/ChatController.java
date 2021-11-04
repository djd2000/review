package com.udacity.jwdnd1.c1.review.controllers;

import com.udacity.jwdnd1.c1.review.domain.ChatMessage;
import com.udacity.jwdnd1.c1.review.domain.Message;
import com.udacity.jwdnd1.c1.review.dto.ChatForm;
import com.udacity.jwdnd1.c1.review.services.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class ChatController {

    private MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/chat")
    public String getChatPage(ChatForm chatForm, Model model){
        model.addAttribute("messages", Collections.emptyList());
        return "chat";
    }

    @PostMapping("/chat")
    public String postChatMessage(@ModelAttribute("chatForm") ChatForm chatForm, Model model){
        ChatMessage message = new ChatMessage();
        chatForm.setMessageType("Shout");
        switch (chatForm.getMessageType()){
            case "Shout": message.setMessage(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper": message.setMessage(chatForm.getMessageText().toLowerCase());
                break;
            default: message.setMessage(chatForm.getMessageText());
                break;
        }
        message.setUserName(chatForm.getUserName());
        messageService.addMessage(message);
        model.addAttribute("messages",messageService.getMessages());
        return "chat";
    }
}
