package com.bandb.resume.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bhanu on 5/26/2016.
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class ResumeController {

    @RequestMapping("/home")
    public String home(){return "Home Page";}

    @RequestMapping("/name/{name}")
    public String sayName(@PathVariable String name){
        return "Hi! " + name;
    }
}
