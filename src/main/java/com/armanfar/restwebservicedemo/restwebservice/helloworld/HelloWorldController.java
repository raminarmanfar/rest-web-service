package com.armanfar.restwebservicedemo.restwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world/{name}")
    public String getHelloWorld(@PathVariable String name) {
        return "Hello World, " + name;
    }
}