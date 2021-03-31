package com.challenge.repository;

import com.challenge.entity.Challenge;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChallengeRepository extends CrudRepository<Challenge, Long> {

    @Query(value = "SELECT * FROM challenge AS c" +
            " INNER JOIN acceleration AS a" +
            " ON c.id = a.challenge_id" +
            " INNER JOIN candidate AS ca" +
            " ON ca.acceleration_id = a.id" +
            " INNER JOIN users AS u" +
            " ON ca.user_id = u.id" +
            " WHERE a.id = :accelerationId AND u.id = :userId", nativeQuery = true)
    List<Challenge> findChallenges(@Param("accelerationId") Long accelerationId,
                                   @Param("userId") Long userId);

}
