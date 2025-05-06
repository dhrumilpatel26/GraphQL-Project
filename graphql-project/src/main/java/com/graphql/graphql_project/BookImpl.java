package com.graphql.graphql_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class BookImpl implements BookService{
    private BookRepo bookRepo;
    @Autowired
    public BookImpl(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }
    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int Id) {
//        Optional<Book> book = this.bookRepo.findById(Id);
//        return book.orElse(new Book());
        return this.bookRepo.findById(Id).orElseThrow(()->new RuntimeException("book not found"));
    }
}
