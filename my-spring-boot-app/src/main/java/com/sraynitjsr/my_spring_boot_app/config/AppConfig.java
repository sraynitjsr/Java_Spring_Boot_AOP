package com.sraynitjsr.my_spring_boot_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String name() {
        return "Subhradeep Ray";
    }
}
