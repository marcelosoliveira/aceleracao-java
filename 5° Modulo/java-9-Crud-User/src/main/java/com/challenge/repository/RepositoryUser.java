package com.challenge.repository;

import com.challenge.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryUser extends CrudRepository<User, Long> {
    User findById(long id);
}
