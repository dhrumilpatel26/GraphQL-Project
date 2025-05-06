package com.graphql.graphql_project;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "new_book")
public class Book {
    @Id
    @JsonProperty("id")
    @GeneratedValue
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.CHAR)
    private int id;

    @JsonProperty("title")
    @Column(name = "title", nullable = false)
    private String title;

    @JsonProperty("author")
    @Column(name = "author", nullable = false)
    private String author;

    @JsonProperty("publisher")
    @Column(name = "publisher", nullable = false)
    private String publisher;

    @JsonProperty("publication_date")
    @Column(name = "publication_date", nullable = false)
    private String publicationDate;

    @JsonProperty("price")
    @Column(name = "price", nullable = false)
    private String price;
}
