package com.water.model;

import com.water.model.enums.UserRole;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    private String adress;

    @Column(nullable = true)
    @OneToOne
    private Provider provider;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "role")
    private UserRole userRole;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
