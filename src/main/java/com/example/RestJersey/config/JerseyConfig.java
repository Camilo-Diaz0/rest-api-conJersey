package com.example.RestJersey.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        this.packages("com.example.RestJersey.controllers");
    }
}
