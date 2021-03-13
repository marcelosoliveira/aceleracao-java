package com.challenge.entity.user;

import com.challenge.entity.candidate.Candidate;
import com.challenge.entity.submission.Submission;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(max = 100)
    private String fullName;

    @NotNull
    @Email
    @Size(max = 100)
    private String email;

    @NotNull
    @Size(max = 50)
    private String nickname;

    @NotNull
    @Size(max = 255)
    private String password;

    @CreatedDate
    private LocalDate createdAt;

    @OneToMany
    private List<Candidate> candidate;

    @OneToMany
    private List<Submission> submission;
}
