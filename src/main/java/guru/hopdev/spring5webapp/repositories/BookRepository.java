package guru.hopdev.spring5webapp.repositories;

import guru.hopdev.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
