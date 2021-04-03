package com.challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EntityListeners(AuditingEntityListener.class)
public class CandidateId implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Acceleration acceleration;

    @ManyToOne
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandidateId)) return false;
        CandidateId that = (CandidateId) o;
        return Objects.equals(getUser(), that.getUser()) && Objects.equals(getAcceleration(), that.getAcceleration()) && Objects.equals(getCompany(), that.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getAcceleration(), getCompany());
    }
}
