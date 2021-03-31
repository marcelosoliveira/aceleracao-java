package com.challenge.repository;

import com.challenge.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT * FROM users AS u" +
            " INNER JOIN candidate AS c ON u.id = c.user_id" +
            " INNER JOIN acceleration AS a ON c.acceleration_id = a.id" +
            " WHERE a.name LIKE %:name%", nativeQuery = true)
    List<User> findByNames(@Param("name") String name);

    @Query(value = "SELECT * FROM users AS u" +
            " INNER JOIN candidate AS c ON c.user_id = u.id" +
            " INNER JOIN company AS co ON co.id = c.company_id" +
            " WHERE co.id = :companyId", nativeQuery = true)
    List<User> findByCompanyId(@Param("companyId") Long companyId);

}
