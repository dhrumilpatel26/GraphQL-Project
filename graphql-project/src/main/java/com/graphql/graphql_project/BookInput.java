package com.graphql.graphql_project;

import lombok.Data;

@Data
public class BookInput {
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    private String price;

}