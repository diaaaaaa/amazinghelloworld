package at.refugeescode.amazinghelloworld.controller;

import org.springframework.stereotype.Component;

@Component
public class Hello {

    private String hello;

    public String sayHello(){

        return "Hello";
    }
}
