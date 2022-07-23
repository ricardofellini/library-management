package ricardo.fellini.librarycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardo.fellini.librarycontrol.domain.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByName(String name);
}
