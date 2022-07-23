package ricardo.fellini.librarycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardo.fellini.librarycontrol.domain.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByName(String name);
}
