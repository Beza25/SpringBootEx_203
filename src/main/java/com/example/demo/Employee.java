package com.example.demo;

public class Employee {
    private String firstName;
    private String lastName;
    private int SSN;
    private int DOB;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public int getDOB() {
        return DOB;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
}
