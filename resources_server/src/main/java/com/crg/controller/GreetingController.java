package com.crg.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello :)";
    }
}
