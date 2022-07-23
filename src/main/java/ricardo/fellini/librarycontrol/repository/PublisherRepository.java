package ricardo.fellini.librarycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardo.fellini.librarycontrol.domain.Publisher;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    List<Publisher> findByName(String name);
}
