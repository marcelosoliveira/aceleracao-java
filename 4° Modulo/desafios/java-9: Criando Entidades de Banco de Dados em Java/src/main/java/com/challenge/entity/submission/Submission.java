package com.challenge.entity.submission;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "submission")
public class Submission {

    @EmbeddedId
    private SubmissionPrimaryKey submissionPrimaryKey;

    @NotNull
    private float score;

    @CreatedDate
    private LocalDate createdAt;

}
