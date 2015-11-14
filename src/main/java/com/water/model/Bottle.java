package com.water.model;

import javax.persistence.*;

@Entity
@Table(name = "bottles")
public class Bottle {

    @Id
    private Long id;


    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "water_left", nullable = false)
    private Integer waterLeft;


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

    public Integer getWaterLeft() {
        return waterLeft;
    }

    public void setWaterLeft(Integer waterLeft) {
        this.waterLeft = waterLeft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
