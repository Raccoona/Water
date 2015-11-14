package com.water.util.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRegistrationForm {

    @NotEmpty(message = "This field can`t be empty")
    private String login;

    @Size(min = 7, max = 20, message = "Wrong size of password")
    private String password;

    @Size(min = 7, max = 20, message = "Wrong size of password")
    private String repassword;

    @NotEmpty(message = "This field can`t be empty")
    private String name;

    @NotNull
    private Integer userRole;

    @NotEmpty(message = "This field can`t be empty")
    private String city;

    @NotEmpty(message = "This field can`t be empty")
    private String mobilePhone;

    @Email(message = "Not valid email")
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
