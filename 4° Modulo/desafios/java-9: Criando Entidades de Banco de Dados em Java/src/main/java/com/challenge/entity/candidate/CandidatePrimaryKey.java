package com.challenge.entity.candidate;

import com.challenge.entity.acceleration.Acceleration;
import com.challenge.entity.company.Company;
import com.challenge.entity.user.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CandidatePrimaryKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "acceleration_id")
    private Acceleration acceleration;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandidatePrimaryKey)) return false;
        CandidatePrimaryKey that = (CandidatePrimaryKey) o;
        return Objects.equals(user, that.user) && Objects.equals(acceleration, that.acceleration) && Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, acceleration, company);
    }
}
