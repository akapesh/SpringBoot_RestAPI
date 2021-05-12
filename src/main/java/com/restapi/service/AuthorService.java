package com.restapi.service;

import com.restapi.models.Author;
import com.restapi.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repository;

    public Author saveAuthor(Author author){
        return repository.save(author);
    }

    public List<Author> saveAuthors(List<Author> authors){
        return repository.saveAll(authors);
    }

    public Author getAuthorById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteAuthor(int id){
        repository.deleteById(id);
        return "Author has been deleted with id " + id;
    }

    public Author updateAuthor(Author author){
        Author existingAuthor=repository.findById
                (author.getId()).orElse(null);
        existingAuthor.setName(author.getName());
        existingAuthor.setBooks(author.getBooks());
        return repository.save(existingAuthor);
    }



}

