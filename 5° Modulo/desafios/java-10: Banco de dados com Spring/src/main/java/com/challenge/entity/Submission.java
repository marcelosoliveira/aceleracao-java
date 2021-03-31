package com.challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "submission")
public class Submission {

    @EmbeddedId
    private SubmissionId id;

    @Column
    @NotNull
    private Float score;

    @CreatedDate
    private LocalDateTime createdAt;

}
