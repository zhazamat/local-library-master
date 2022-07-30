package library.avenir.test.repository;

import library.avenir.test.entity.BookInstance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookInstanceRepository extends JpaRepository<BookInstance, UUID> {
}
