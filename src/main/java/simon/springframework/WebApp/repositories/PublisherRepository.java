package simon.springframework.WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import simon.springframework.WebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}