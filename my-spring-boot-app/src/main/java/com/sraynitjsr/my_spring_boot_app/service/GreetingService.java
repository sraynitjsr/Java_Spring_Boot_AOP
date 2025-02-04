package com.sraynitjsr.my_spring_boot_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final String name;

    @Autowired
    public GreetingService(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello Java Folks, From " + this.name;
    }

    public String sayBye() {
        return "Goodbye Java Folks, From " + this.name;
    }
}
