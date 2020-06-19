package com.cvrce.dto;

public class LoginDto {


    public String Gender;
    private String username;

    private String password;

    private String phone;

    private String address;

    private String pre;

    private String name;

    public LoginDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {return Gender;}

    public void setGender(String gender) { this.Gender = gender;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
