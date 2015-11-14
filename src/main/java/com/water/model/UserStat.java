package com.water.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_stats")
public class UserStat {

    @Id
    private Long id;

    @Column(nullable = false)
    private User user;

    private Integer value;

    @Temporal(TemporalType.DATE)
    private Date day;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
