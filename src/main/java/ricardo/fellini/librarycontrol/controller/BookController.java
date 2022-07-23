package ricardo.fellini.librarycontrol.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ricardo.fellini.librarycontrol.domain.Book;
import ricardo.fellini.librarycontrol.service.BookService;

import java.util.List;

@RestController
@RequestMapping("books")
@Log4j2
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> listAll(){
        return ResponseEntity.ok(bookService.findAll());
    }
}
