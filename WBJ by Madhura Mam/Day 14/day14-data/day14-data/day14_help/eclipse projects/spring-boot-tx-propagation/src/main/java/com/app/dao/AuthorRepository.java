package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> {
}
