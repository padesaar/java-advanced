package org.sda;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {



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

        //EXEPTIONS
        // Throwable - ctrl ja klikid, siis näitab throwable exeptionite klassi
        //Exception sama lugu
        //ArrayIndexOutOfBoundsException

        //exception handling try and catch
        try{
            int[] integerArray = {1, 4, 56, 7};

            for(int i = 0; i <= integerArray.length; i++) {
                System.out.println(integerArray[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){ //e on variable name, just that
            System.out.println("The number can't be printed because it's not available in array");
        } catch (Exception exception) {
            System.out.println("Exception being caught");
        } finally { //this block will be executed irrespective of catch blocks
            int a = 15;
            System.out.println("Finally executed a:" + a);
        }
        // if you don't know what exception you may get,
        //you put catch (Exception exception) sulgudesse

        try {
            int y = 10 / 0; //this line should throw an exception
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("The value of y is not determined, Error:" + e.getLocalizedMessage());
        }

        //throwing an exception
        //custom / user-defined exception
        // System.out.println(personService.findPersonByFirstName("Johnny").toString());
        //System.out.println(personService.findPersonByFirstName("Jim").toString());


        try { //it means that we are attempting to make a call

            System.out.println(personService.findPersonByFirstName("Johnny").toString());
        } catch(PersonNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            //alternative code for here in real life
        }

        //you can use switch, fo etc in try block
        Person testPerson = null;
        try { //it means that we are attempting to make a call
            testPerson = personService.findPersonByFirstName("Jamie");
            System.out.println(person.toString());
        } catch(PersonNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        //alternative code for here in real life
            testPerson = new Person();
            testPerson.setFirstName("Unknown");
            testPerson.setLastName("Unknown last");
            testPerson.setAge(45);

        }
        System.out.println(testPerson.toString());

        //exercise - exception
        /**
         *  Write an applicatio nthat will read the input and print back value that user, provided,
         *  use try/catch statements to parse the input, e.g. I/O:
         *
         *  Input: 10
         *  Output int -> 10
         */

        try{
           displayNumber();
        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

        private static void displayNumber(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("int -> " + i);
        } else if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("double -> " + d);
        } else {
            throw new InputMismatchException("Hey! That's not a value. Try once more!");
        }

        }


}