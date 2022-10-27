package org.sda;

import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        //Interface
        Person person = new Person();
        person.setFirstName("Kätlin");
        person.setLastName("Padesaar-Korela");
        person.setAge(32);

        //left side should be interface name and right side should be interface's implementation class name
        PersonService personService = new PersonServiceImpl();

        //implementation method calls
        System.out.println("Person's birth year:" + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's full name:" + personService.getPersonFullName(person));


    }
}