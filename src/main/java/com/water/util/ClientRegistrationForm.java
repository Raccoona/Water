package com.water.util;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class ClientRegistrationForm {

    @NotEmpty(message = "This field can`t be empty")
    private String login;

    @Size(min = 5, max = 20, message = "Wrong size of password")
    private String password;

    @Size(min = 5, max = 20, message = "Wrong size of password")
    private String repassword;

    @NotEmpty(message = "This field can`t be empty")
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
