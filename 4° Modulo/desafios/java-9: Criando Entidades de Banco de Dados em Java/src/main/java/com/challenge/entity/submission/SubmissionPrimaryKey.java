package com.challenge.entity.submission;

import com.challenge.entity.challenge.Challenge;
import com.challenge.entity.user.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SubmissionPrimaryKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubmissionPrimaryKey)) return false;
        SubmissionPrimaryKey that = (SubmissionPrimaryKey) o;
        return Objects.equals(user, that.user) && Objects.equals(challenge, that.challenge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, challenge);
    }
}
