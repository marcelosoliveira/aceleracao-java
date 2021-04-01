package com.challenge.repository;

import com.challenge.entity.submission.Submission;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCompany extends CrudRepository<Submission, Long> {
}
