package com.uditpatil.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.uditpatil.mvc.models.Book;
import com.uditpatil.mvc.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId") Long bookId) {
		
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		System.out.println(book.getDescription());
		System.out.println(book.getLanguage());
		System.out.println(book.getTitle());
		System.out.println(book.getNumberOfPages());
		return "show.jsp";
	}
}
