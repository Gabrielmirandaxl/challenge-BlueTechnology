package com.challenge.crud.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true, length = 15)
    private String phone;
    @Column(nullable = false)
    private LocalDateTime registrionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getRegistrionDate() {
        return registrionDate;
    }

    public void setRegistrionDate(LocalDateTime registrionDate) {
        this.registrionDate = registrionDate;
    }
}
