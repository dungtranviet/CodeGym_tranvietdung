package com.codegym.demo.model;

import javax.validation.constraints.*;

public class User {
    @Size(min = 2, max = 30, message = "ten phai tu 2 den 30 ky tu")
    @NotEmpty(message = "ten khong duoc trong")
    private String name;

    @Min(value = 18, message = "tuoi phai lon hon 18")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}