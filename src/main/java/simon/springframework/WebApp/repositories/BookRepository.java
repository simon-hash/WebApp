package simon.springframework.WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import simon.springframework.WebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {


}
