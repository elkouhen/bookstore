package fr.cloudouest.bookstore.entity;

import org.springframework.data.annotation.Id;

public class Book {

    @Id
    private Long id;
    private String author;
    private String title;


    public Book(long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }


    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
