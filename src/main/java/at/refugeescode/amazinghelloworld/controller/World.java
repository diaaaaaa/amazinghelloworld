package at.refugeescode.amazinghelloworld.controller;

import org.springframework.stereotype.Component;

@Component
public class World {

    private String world;

    public String sayWorld(){

        return "World";

    }
}
