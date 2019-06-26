package com.marvel.demo.ebonymaw.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hello")
public class HelloRestController {
    @GetMapping
    public String hello(
        @RequestParam(name = "name", required = false) String name
    ) {
        return "Hello " + name;
    }
}