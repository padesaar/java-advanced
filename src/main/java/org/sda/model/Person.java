package org.sda.model;

import java.util.Random;

/**
 * Person model
 *Example of Encapsulation
 * @author Kätlin Padesaar-Korela
 */

public class Person {

    //fields
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber; //string sest number algab + märgiga
    private String address;


    protected boolean isAlive;

    //all arguments' constructor, all fields in one line between the braces
    public Person(Long id, String firstname, String lastname, String email, String phoneNumber, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //parameterized constructor
    public Person (Long id, String address){
        this.id = id;
        this.address = address;
    }

    // Java will create a constructor automatically by default.
    // it is called as default constructor

    // no-arguments constructor
    public Person() {
        this.id = new Random().nextLong();
        //you can write any code here
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if(!firstname.isEmpty()) { //you can add any conditions
        this.firstname = firstname;
    }
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected boolean isAlive() {
        return isAlive;
    }

    protected void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
