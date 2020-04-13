package at.refugeescode.amazinghelloworld.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

Hello hello = new Hello();
World world = new World();


    public String sayHelloWorld() {
        return hello.sayHello() + "_" + world.sayWorld();
    }
}
