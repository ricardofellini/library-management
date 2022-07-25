package ricardo.fellini.librarycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardo.fellini.librarycontrol.domain.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findByName(String name);
}
