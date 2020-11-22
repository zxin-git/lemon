package com.zxin.java.openapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/api/ball")
public class BallController {

 
    @GetMapping("/")
    public Collection<String> findBooks() {
        return Arrays.asList("");
    }
 
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateBook(@PathVariable("id") final String id) {
        return id;
    }
}