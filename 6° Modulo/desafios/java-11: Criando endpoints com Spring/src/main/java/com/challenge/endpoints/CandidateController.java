package com.challenge.endpoints;

import com.challenge.entity.Candidate;
import com.challenge.service.impl.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/{userId}/{accelerationId}/{companyId}")
    public Optional<Candidate> findByIds(@PathVariable("userId") Long userId,
                                         @PathVariable("accelerationId") Long accelerationId,
                                         @PathVariable("companyId") Long companyId) {
        return this.candidateService.findById(userId, companyId, accelerationId);
    }

    @GetMapping
    public List<Candidate> findCompanyId(@PathParam("companyId") Long companyId) {
        return this.candidateService.findByCompanyId(companyId);
    }

}
