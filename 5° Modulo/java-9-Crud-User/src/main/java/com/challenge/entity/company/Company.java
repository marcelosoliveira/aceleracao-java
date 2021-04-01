package com.challenge.entity.company;

import com.challenge.entity.candidate.Candidate;
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
@Table(name = "company")
public class Company {

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

    @CreatedDate
    private LocalDate createdAt;

    @OneToMany
    private List<Candidate> candidate;
}
