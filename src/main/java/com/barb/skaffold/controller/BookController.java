package com.barb.skaffold.controller;

import com.barb.skaffold.dto.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class BookController {

    @GetMapping("/")
    public String home(){
        return "Voila";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Collections.singletonList(new Book(1, "Louie"));
    }
}
