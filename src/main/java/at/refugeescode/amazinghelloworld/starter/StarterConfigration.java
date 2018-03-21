package at.refugeescode.amazinghelloworld.starter;

import at.refugeescode.amazinghelloworld.controller.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfigration {

    @Bean
    ApplicationRunner startMyApplication(HelloWorld helloWorld) {
        return args -> {
            System.out.println(helloWorld.sayHelloWorld());
        };
    }
}
