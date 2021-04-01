package com.challenge.repository;

import com.challenge.entity.submission.Submission;
import org.springframework.data.repository.CrudRepository;

public interface RepositorySubmission extends CrudRepository<Submission, Long> {
}
