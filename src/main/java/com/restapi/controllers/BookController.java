package com.restapi.controllers;

import com.restapi.models.Book;
import com.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> books){
        return service.saveBooks(books);
    }

    @GetMapping("/getBook/{id}")
    public Book findBookById(@PathVariable int id){
        return service.getBookById(id);
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id){
        return service.deleteBook(id);
    }
}
