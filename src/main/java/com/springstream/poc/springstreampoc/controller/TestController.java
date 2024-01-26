package com.springstream.poc.springstreampoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    StreamBridge streamBridge;

    @GetMapping("test")
    public String test(){

        streamBridge.send("fizzBuzzProducer-out-0", "test data");

        return "done";
    }
    
}
