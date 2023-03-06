package com.onlyxcodes.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlyxcodes.app.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}