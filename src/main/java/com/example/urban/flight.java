package com.example.urban;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {
        return "Please book flight from MMT, 50% discount in South India";
    }
}