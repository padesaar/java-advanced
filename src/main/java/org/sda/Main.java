package org.sda;

import org.sda.model.Dog;
import org.sda.model.Passenger;
import org.sda.model.Person;
import org.sda.model.PrivatePassenger;

public class Main {
    public static void main(String[] args){
        //ENCAPSULATION
        //non arg constructor

        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());


        //all argument constructor call
        Person person1 = new Person(123455L, "Kätlin", "Padesaar-Korela", "abc@gmail.com", "+372377849", "Tartu tee, Tallinn" );
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());

        Person person2 = new Person();
        person2.setFirstname("Tony");
        person2.setLastname("Stark");
        System.out.println(person2.getFirstname());
        System.out.println(person2.getLastname());

        Dog dog = new Dog(true, "GERMAN SHEPPERD");
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());

        //INHERITENCE
        Passenger passenger = new Passenger("CARD", "Pärnu");
        passenger.setEmail("passenger@gmail.com"); //access from Person class - mother class


        PrivatePassenger privatePassenger = new PrivatePassenger("CARD", "Tallinn", true, "12314541321");
        privatePassenger.setPersonalIDCode("232648264728"); //access PrivatePassenger's fields
        privatePassenger.setDestinationAddress("Tartu");//access Passenger's field
        privatePassenger.setPhoneNumber("+3729383822"); //access Person's fields



    }
}