package udemy.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
