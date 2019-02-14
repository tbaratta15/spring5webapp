package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/*
*Creating a CRUD Repository Book
 */

public interface BookRepository extends CrudRepository<Book, Long> {
}
