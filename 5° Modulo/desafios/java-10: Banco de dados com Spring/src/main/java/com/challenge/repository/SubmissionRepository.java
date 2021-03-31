package com.challenge.repository;

import com.challenge.entity.Submission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionRepository extends CrudRepository<Submission, Long> {

    @Query(value = "SELECT MAX(s.score) AS MaxScore FROM submission AS s" +
            " INNER JOIN challenge AS c ON c.id = s.challenge_id" +
            " WHERE c.id = :challengeId", nativeQuery = true)
    BigDecimal findIdMaxScore(@Param("challengeId") Long id);

    @Query(value = "SELECT * FROM submission AS s" +
            " INNER JOIN challenge AS c" +
            " ON s.challenge_id = c.id" +
            " INNER JOIN acceleration AS a" +
            " ON a.challenge_id = c.id" +
            " WHERE c.id = :challengeId AND a.id = :accelerationId ", nativeQuery = true)
    List<Submission> findSubmissions(@Param("challengeId") Long challengeId,
                                     @Param("accelerationId") Long accelerationId );
}
