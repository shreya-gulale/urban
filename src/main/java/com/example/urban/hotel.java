package com.example.urban;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData() {
        return "Please book hotel from MMT, 25% discount in South India";
    }
}
