package com.graphql.graphql_project;

import java.util.List;
import java.util.UUID;

public interface BookService{
    Book create(Book book);

    List<Book> getAll();

    Book get(int Id);
}
