package com.challenge.entity.acceleration;

import com.challenge.entity.candidate.Candidate;
import com.challenge.entity.challenge.Challenge;
import lombok.Getter;
import lombok.Setter;
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
    @Getter
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Setter
    @Getter
    @NotNull
    @Size(max = 100)
    @Column(length = 100)
    private String name;

    @Setter
    @Getter
    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private String slug;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    @CreatedDate
    private LocalDate createdAt;

    @OneToMany
    private List<Candidate> candidate;

}
