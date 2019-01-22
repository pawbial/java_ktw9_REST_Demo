package sdacademy.ktw9.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sdacademy.ktw9.model.Book;

import java.util.LinkedList;
import java.util.List;

@RestController
public class LibraryController {

    private List <Book> books = new LinkedList<>();

    @GetMapping("/books")
    public ResponseEntity <?> getBooks () {
        return new ResponseEntity<>(books, HttpStatus.CREATED);
    }

    @PostMapping("/addbook")
    public ResponseEntity<?> addBook (@RequestBody Book book) {
        books.add(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
