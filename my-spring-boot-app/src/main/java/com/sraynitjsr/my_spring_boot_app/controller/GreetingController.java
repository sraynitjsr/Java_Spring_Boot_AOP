package com.sraynitjsr.my_spring_boot_app.controller;

import com.sraynitjsr.my_spring_boot_app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/api/sayHello")
    public String sayHello() {
        return greetingService.sayHello();
    }

    @GetMapping("/api/sayBye")
    public String sayBye() {
        return greetingService.sayBye();
    }
}
