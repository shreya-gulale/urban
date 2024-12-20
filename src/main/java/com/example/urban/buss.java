package com.example.urban;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class buss {
    @GetMapping("/buss")
    public String getData() {
        return "Please book buss from MMT, 10% discount in South India";
    }
}
