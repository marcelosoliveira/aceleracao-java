package com.challenge.repository;

import com.challenge.entity.Acceleration;
import com.challenge.entity.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccelerationRepository extends CrudRepository<Acceleration, Long> {
    @Query(value = "SELECT * FROM acceleration AS a" +
            " INNER JOIN candidate AS c ON c.acceleration_id = a.id" +
            " INNER JOIN company AS co ON co.id = c.company_id" +
            " WHERE co.id = :companyId", nativeQuery = true)
    List<Acceleration> findByCompanyId(@Param("companyId") Long companyId);

    @Query(value = "SELECT a.name FROM acceleration AS a" +
            " WHERE a.name LIKE %:name%", nativeQuery = true)
    List<Acceleration> findNames(@Param("name") String name);

}
