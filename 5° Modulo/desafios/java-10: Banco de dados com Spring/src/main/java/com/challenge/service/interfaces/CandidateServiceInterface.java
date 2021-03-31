package com.challenge.service.interfaces;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;

import java.util.List;
import java.util.Optional;

public interface CandidateServiceInterface extends ServiceInterface<Candidate> {

    default Optional<Candidate> findById(CandidateId id) {
        return null;
    }

    default Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
        return null;
    }

    List<Candidate> findByCompanyId(Long companyId);

    List<Candidate> findByAccelerationId(Long accelerationId);
}
