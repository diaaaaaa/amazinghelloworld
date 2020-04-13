package at.refugeescode.amazinghelloworld.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

Hello hello = new Hello();
World world = new World();


    public String sayHelloWorld() {
        return hello.sayHello() + "_" + world.sayWorld();
    }
    @RequestMapping("/")
    public String greeyting(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "body, html {\n" +
                "  height: 100%;\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".bgimg {\n" +
                "  background-image: url('https://images.unsplash.com/reserve/Af0sF2OS5S5gatqrKzVP_Silhoutte.jpg?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80');\n" +
                "  height: 100%;\n" +
                "  background-position: center;\n" +
                "  background-size: cover;\n" +
                "  position: relative;\n" +
                "  color: black;\n" +
                "  font-family: \"Courier New\", Courier, monospace;\n" +
                "  font-size: 25px;\n" +
                "}\n" +
                "\n" +
                ".topleft {\n" +
                "  position: absolute;\n" +
                "  top: 0;\n" +
                "  left: 16px;\n" +
                "}\n" +
                "\n" +
                ".bottomleft {\n" +
                "  position: absolute;\n" +
                "  bottom: 0;\n" +
                "  left: 16px;\n" +
                "}\n" +
                "\n" +
                ".middle {\n" +
                "  position: absolute;\n" +
                "  top: 50%;\n" +
                "  left: 50%;\n" +
                "  transform: translate(-50%, -50%);\n" +
                "  text-align: center;\n" +
                "}\n" +
                "\n" +
                "hr {\n" +
                "  margin: auto;\n" +
                "  width: 40%;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"bgimg\">\n" +
                "  <div class=\"topleft\">\n" +
                "    <p>D . I . A . A</p>\n" +
                "  </div>\n" +
                "  <div class=\"middle\">\n" +
                "    <h1>COMING SOON</h1>\n" +
                "    <hr>\n" +
                "    <p>35 days left</p>\n" +
                "  </div>\n" +
                "  <div class=\"bottomleft\">\n" +
                "    <p>Diaa Alkhatib</p>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
    }
}
