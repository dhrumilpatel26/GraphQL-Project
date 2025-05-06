package com.graphql.graphql_project;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepo extends JpaRepository<Book,Integer> {

//    Book findAllById(UUID id);

}
