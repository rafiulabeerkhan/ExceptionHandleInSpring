package com.luv2code.demo.Entity;

public class Student_Entity {
    private String firstName;
    private String lastName;

    public Student_Entity() {

    }

    public Student_Entity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
