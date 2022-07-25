package ricardo.fellini.librarycontrol.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardo.fellini.librarycontrol.domain.Author;
import ricardo.fellini.librarycontrol.requests.AuthorPostRequestBody;
import ricardo.fellini.librarycontrol.service.AuthorService;
import ricardo.fellini.librarycontrol.util.DateUtil;

import javax.validation.Valid;

@RestController
@RequestMapping("authors")
@Log4j2
@RequiredArgsConstructor
public class AuthorController {


    private final DateUtil dateUtil;
    private final AuthorService authorService;

    @GetMapping("/")
    public ResponseEntity<Page<Author>> listAll(Pageable pageable){
        return ResponseEntity.ok(authorService.listAll(pageable));
    }

    @PostMapping("/")
    public ResponseEntity<Author> save(@RequestBody @Valid AuthorPostRequestBody authorPostRequestBody){
        return new ResponseEntity<>(authorService.save(authorPostRequestBody), HttpStatus.CREATED);
    }
}
