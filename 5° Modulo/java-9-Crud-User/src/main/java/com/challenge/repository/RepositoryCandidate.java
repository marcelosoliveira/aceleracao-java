package com.challenge.repository;

import com.challenge.entity.candidate.Candidate;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCandidate extends CrudRepository<Candidate, Long> {
}
