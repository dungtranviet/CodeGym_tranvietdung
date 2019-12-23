package com.example.validate_form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "tên không được để trống")
    @Size(min = 5,max = 45,message = "tên phải có độ dài từ 5 đến 45 ký tự")
    private String lastName;
    @NotBlank(message = "tên không được để trống")
    @Size(min = 5,max = 45,message = "tên phải có độ dài từ 5 đến 45 ký tự")
    private String firstName;
    @Pattern(regexp = "^0.*",message = "số điện thoại phải bắt đầu bằng số 0")
    @Pattern(regexp = "^[\\d]{10,11}$",message = "số điện thoại phải là 10 hoặc 11 số")
    private String phoneNumber;
    @Pattern(regexp = "^[\\w]{2,}@[\\w]{2,10}\\.[\\w]{2,4}$",message = "email theo định dạng abc@abc.abc")
    private String email;
    @Min(value = 18,message = "tuổi phải lớn hơn hoặc bằng 18")
    private int age;
    public User() {
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
