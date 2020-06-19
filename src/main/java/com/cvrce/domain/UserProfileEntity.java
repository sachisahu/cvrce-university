package com.cvrce.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_profile")
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    //private String pre;

    private String name;

    private String username;

    private String password;

    private String phone;

    private String address;

    private String gender;

    public Long getId() {
        return id;
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

    public String getGender() {return gender; }

    public void setGender(String gender) {this.gender = gender;}

    //public String getPre(String pre) {return this.pre;}

    //public void setPre(String pre) {this.pre = pre;}

    public String getName(String name) { return this.name;}

    public void setName(String name) {this.name = name; }
}
