package challenge;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface QuoteRepository extends CrudRepository<Quote, Long> {

    @Query(value = "SELECT id, actor, detail FROM scripts" +
            " ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Quote findAllQuote();

    @Query(value = "SELECT id, actor, detail FROM scripts " +
            " WHERE actor = :actor" +
            " ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Quote findActor(@Param("actor") String actor);
}
