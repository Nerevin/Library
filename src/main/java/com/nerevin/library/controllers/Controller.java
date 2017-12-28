package com.nerevin.library.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.nerevin.library.entities.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/book")
    public Book book(@RequestParam(value="artName", defaultValue="unknown") String artName, @RequestParam(value="authorName", defaultValue="unknown")
            String authorName) {
        return new Book(artName, authorName);
    }
}
