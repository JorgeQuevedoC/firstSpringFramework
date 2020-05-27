package udemy.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
