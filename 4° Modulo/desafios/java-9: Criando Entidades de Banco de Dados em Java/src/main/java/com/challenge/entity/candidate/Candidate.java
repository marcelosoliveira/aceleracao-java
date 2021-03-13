package com.challenge.entity.candidate;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "candidate")
public class Candidate {

    @EmbeddedId
    private CandidatePrimaryKey candidatePrimaryKey;

    @NotNull
    private int status;

    @CreatedDate
    private LocalDate createdAt;
}
