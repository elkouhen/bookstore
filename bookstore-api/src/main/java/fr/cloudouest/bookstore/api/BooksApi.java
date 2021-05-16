package fr.cloudouest.bookstore.api;

import fr.cloudouest.bookstore.entity.Book;
import fr.cloudouest.bookstore.repository.BookRepository;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BooksApi {

    private final BookRepository bookRepository;

    @Autowired
    public BooksApi(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * @return books in bookstore
     */
    @CrossOrigin(origins = "*")
    @GetMapping
    List<Book> listBooks() {

        return IterableUtils.toList(bookRepository.findAll()).stream()
                .map(book -> new Book(book.getId(), "prefix" + book.getAuthor(), book.getTitle())
                ).collect(Collectors.toList());
    }
}
