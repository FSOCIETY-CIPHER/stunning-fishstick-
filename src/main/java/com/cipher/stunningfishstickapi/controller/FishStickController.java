package com.cipher.stunningfishstickapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fish-stick")
public class FishStickController {

    @GetMapping("/")
    public String demo(){
        return "Welcome to the Stunning FishStick APi";
    }
}
