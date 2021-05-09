package fr.cloudouest.bookstore.api;

import fr.cloudouest.bookstore.entity.Book;
import fr.cloudouest.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksApi {

    private final BookRepository bookRepository;

    @Autowired
    public BooksApi(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    List<Book> listBooks() {

        List<Book> result = new ArrayList<>();
        bookRepository.findAll().forEach(result::add);

        return result;
    }
}
