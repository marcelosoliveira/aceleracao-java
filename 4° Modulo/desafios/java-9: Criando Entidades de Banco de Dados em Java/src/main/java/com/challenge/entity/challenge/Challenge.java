package com.challenge.entity.challenge;

import com.challenge.entity.acceleration.Acceleration;
import com.challenge.entity.submission.Submission;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "challenge")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    @Size(max = 50)
    private String slug;

    @CreatedDate
    private LocalDate createdAt;

    @OneToMany(mappedBy = "challenge")
    private List<Acceleration> acceleration;

    @OneToMany
    private List<Submission> submission;

}
