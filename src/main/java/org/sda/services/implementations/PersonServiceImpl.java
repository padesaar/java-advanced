package org.sda.services.implementations;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;
import java.util.*;

/**
 * Implementation of Person Service
 *
 * @author Kätlin Padesaar-Korela
 */

public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String getPersonFullName(Person person) {

        return person.getFirstName() + " " + person.getLastName();
    }

    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {
        Person resultPerson = null;
        //search a person with a given firstname from the random list
        for(Person person : getRandomPerson()){
            if(person.getFirstName().equals(firstName)){
                resultPerson = person;
                break; //comes out of the for loop
            }

        }
        //if the person is still not found then throw an exception
        if(resultPerson == null){
            throw new PersonNotFoundException(firstName);
        }
        return resultPerson;
    }

    //PRIVATE METHODS//

    private List<Person> getRandomPerson() {

        Person person1 = new Person();
        person1.setFirstName("James");
        person1.setLastName("Brockovich");
        person1.setAge(40);

        Person person2 = new Person();
        person2.setFirstName("Jason");
        person2.setLastName("Statham");
        person2.setAge(54);

        Person person3 = new Person();
        person3.setFirstName("Jim");
        person3.setLastName("Carrey");
        person3.setAge(60);

        return List.of(person1, person2, person3);

}
}