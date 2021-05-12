package com.restapi.controllers;

import com.restapi.models.Author;
import com.restapi.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping("/addAuthor")
    public Author saveAuthor(@RequestBody Author author) {
        return service.saveAuthor(author);
    }

    @PostMapping("/addAuthors")
    public List<Author> addBooks(@RequestBody List<Author> authors){
        return service.saveAuthors(authors);
    }

    @GetMapping("/getAuthor/{id}")
    public Author findAuthorById(@PathVariable int id){
        return service.getAuthorById(id);
    }

    @PutMapping("/updateAuthor")
    public Author updateAuthor(@RequestBody Author author){
        return service.updateAuthor(author);
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable int id){
        return service.deleteAuthor(id);
    }
}
