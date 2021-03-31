package com.challenge.services;

import com.challenge.entity.Challenge;
import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SubmissionService implements SubmissionServiceInterface {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Autowired
    private ChallengeService challengeService;

    @Autowired
    private AccelerationService accelerationService;

    @Override
    public Submission save(Submission submission) {
        return submissionRepository.save(submission);
    }

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        if (submissionRepository.findIdMaxScore(challengeId) == null) {
            return BigDecimal.ZERO;
        }
        return submissionRepository.findIdMaxScore(challengeId);
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return submissionRepository.findSubmissions(challengeId, accelerationId);
    }
}
