package com.netsurfingzone.service;

import org.springframework.stereotype.Component;
import com.netsurfingzone.entity.Book;

@Component
public interface BookService {
	public Book saveBook(Book book);
	public Book findById(int bookId);
}
