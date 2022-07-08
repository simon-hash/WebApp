package simon.springframework.WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import simon.springframework.WebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
