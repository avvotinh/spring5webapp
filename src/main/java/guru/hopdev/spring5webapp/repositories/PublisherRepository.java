package guru.hopdev.spring5webapp.repositories;

import guru.hopdev.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
