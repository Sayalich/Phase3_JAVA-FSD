package com.onlyxcodes.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyxcodes.app.model.Book;
import com.onlyxcodes.app.repository.BookRepository;

@RestController
@RequestMapping("books")
public class BookController {

	@Autowired
	BookRepository bookrepository;
	
	// retrieve all book from database
	@GetMapping("all")
	public List<Book> getAllBook()
	{
		List<Book> book=(List<Book>) bookrepository.findAll();
		return book;
	}
	
	// insert new book into database
	@PostMapping("add")
	public Book addBook(@RequestBody Book book)
	{
		return bookrepository.save(book);
	}
	
	// get particular book by their ID
	@GetMapping("book/{id}")
	public Optional<Book> getBookId(@PathVariable int id)
	{
		return bookrepository.findById(id);
	}
	
	// update existing book 
	@PutMapping("update/{id}")
	public Book updateBook(@RequestBody Book book)
	{
		return bookrepository.save(book);
	}
	
	// delete particular book from database
	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookrepository.deleteById(id);
	}
}