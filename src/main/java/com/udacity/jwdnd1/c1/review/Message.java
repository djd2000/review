package com.udacity.jwdnd1.c1.review;

public class Message {

    @Override
    public String toString() {
        return "Hello, Spring!";
    }

    public void init() {
        System.out.println("init method called");
    }

    public void destroy() {
        System.out.println("destroy method called");
    }
}
