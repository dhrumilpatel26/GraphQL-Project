package com.graphql.graphql_project;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Data
@Controller

public class BookController {
    @Autowired
    private BookService bookService;
    public Book create(@RequestBody Book book){
        return this.bookService.create(book);
    }

//    @MutationMapping("createBook")
//    public Book create(@Argument BookInput book){
//        return new Book();
////        Book b=new Book();
////        b.setTitle (book.getTitle());
////        b.setAuthor(book.getAuthor());
////        b.setPublisher(book.getPublisher());
////        b.setPublicationDate(book.getPublicationDate());
////        b.setPrice(book.getPrice());
////        return this.bookService.create(b);
//    }
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }
    @QueryMapping("getBook")
    public Book get(@Argument int Id){
    return this.bookService.get(Id);
    }

}

