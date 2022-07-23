package ricardo.fellini.librarycontrol.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ricardo.fellini.librarycontrol.domain.Book;
import ricardo.fellini.librarycontrol.exception.BadRequestException;
import ricardo.fellini.librarycontrol.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findByName(String name){
        return bookRepository.findByName(name);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book findByIdOrThrowBadRequestException(long id){
        return bookRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Book not found with this ID.:" + id));
    }


}
