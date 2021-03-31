package com.challenge.repository;

import com.challenge.entity.Acceleration;
import com.challenge.entity.Company;
import com.challenge.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    @Query(value = "SELECT * FROM company AS co" +
            " INNER JOIN candidate AS c" +
            " ON c.company_id = co.id" +
            " INNER JOIN acceleration AS a" +
            " ON c.acceleration_id = a.id" +
            " WHERE a.id = :accelerationId LIMIT 1", nativeQuery = true)
    List<Company> findAccelerations(@Param("accelerationId") Long accelerationId);

    @Query(value = "SELECT * FROM company AS co" +
            " INNER JOIN candidate AS c" +
            " ON c.company_id = co.id" +
            " INNER JOIN users AS u" +
            " ON c.user_id = u.id" +
            " WHERE u.id = :userId", nativeQuery = true)
    List<Company> findUsers(@Param("userId") Long userId);
}
