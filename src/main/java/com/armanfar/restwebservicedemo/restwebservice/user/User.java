package com.armanfar.restwebservicedemo.restwebservice.user;

import java.util.Date;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {

    private Integer id;

    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @Past(message = "Birthdate should be in the past")
    private Date birthdate;

    public User(Integer id, String name, Date birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    @Override
    public String toString() {
        return "user [birthdate=" + birthdate + ", id=" + id + ", name=" + name + "]";
    }

    
}
