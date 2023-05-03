package com.readme.configServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @GetMapping
    public String test() {
        return "@@@@@@@@@@@@@@";
    }

}
