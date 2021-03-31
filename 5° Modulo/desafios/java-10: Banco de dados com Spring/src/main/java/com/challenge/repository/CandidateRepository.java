package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {

    Optional<Candidate> findById(CandidateId id);

    @Query(value = "SELECT * FROM candidate AS c" +
            " INNER JOIN company AS co" +
            " ON c.company_id = co.id" +
            " WHERE co.id = :companyId", nativeQuery = true)
    List<Candidate> findByCompanys(@Param("companyId") Long companyId);

    @Query(value = "SELECT * FROM candidate AS c" +
            " INNER JOIN acceleration AS a" +
            " ON c.acceleration_id = a.id" +
            " WHERE a.id = :accelerationId", nativeQuery = true)
    List<Candidate> findByAccelerations(@Param("accelerationId") Long accelerationId);

}
