package com.challenge.entity.acceleration;

import com.challenge.entity.candidate.Candidate;
import com.challenge.entity.challenge.Challenge;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "acceleration")
public class Acceleration {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;


    @NotNull
    @Size(max = 100)
    private String name;


    @NotNull
    @Size(max = 50)
    private String slug;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    @CreatedDate
    private LocalDate createdAt;

    @OneToMany
    private List<Candidate> candidate;

}
