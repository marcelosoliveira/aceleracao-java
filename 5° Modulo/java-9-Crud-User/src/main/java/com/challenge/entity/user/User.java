package com.challenge.entity.user;

import com.challenge.entity.candidate.Candidate;
import com.challenge.entity.submission.Submission;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "user")
public class User {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Getter
    @NotNull
    @Column(length = 100)
    private String fullName;

    @Setter
    @Getter
    @NotNull
    @Email
    @Column(length = 100)
    private String email;

    @Setter
    @Getter
    @NotNull
    @Column(length = 50)
    private String nickname;

    @Setter
    @Getter
    @NotNull
    @Column(length = 255)
    private String password;

    @CreatedDate
    private LocalDate createdAt;

    @OneToMany
    private List<Candidate> candidate;

    @OneToMany
    private List<Submission> submission;
}
