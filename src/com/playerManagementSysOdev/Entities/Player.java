package com.playerManagementSysOdev.Entities;

import java.time.LocalDate;

public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birtDay;
    private String nationalIdentity;
    private String email;
    private String password;

    public void Player(){

    }

    public Player(int id, String firstName, String lastName, LocalDate birtDay, String nationalIdentity, String email, String password, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.nationalIdentity = nationalIdentity;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
