package com.challenge.repository;

import com.challenge.entity.challenge.Challenge;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryChallenge extends CrudRepository<Challenge, Long> {
}
