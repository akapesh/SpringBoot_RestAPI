package com.restapi.repository;

import com.restapi.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends
        JpaRepository<Author, Integer> {
}
