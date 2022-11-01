package org.sda.services;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;

import java.time.LocalDate;

/**
 *
 * PersonService interface to handle Person related operations
 * @author Kätlin Padesaar-Korela
 */

public interface PersonService {
    //static field is allowed bot not normal field
    static final int AVERAGE_AGE = 20;

    //Interface - interface in class name
    //it's like a class, but it's not, it is like a blueprint
    //it's like a model for a class
    //don't put private, public or protected in interface

    /**
     *
     * To get the Birth year of the person
     * @param age Age of the person
     * @return Birth year
     */

    //declaration of the matter
    int getPersonBirthYear(int age); //not a static method

    /**
     *
     * to get the full name of the person
     *
     * @param person Person model
     * @return full name as String
     */
    String getPersonFullName(Person person);

    /**
     * to find a person by first name
     * @param firstName firstname of a person
     * @return Person
     */
    Person findPersonByFirstName(String firstName) throws PersonNotFoundException;


    //static matter os allowed
    static int getAverageAge(){
        return AVERAGE_AGE;
    }



}
