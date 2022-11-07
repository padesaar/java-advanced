package org.sda;

import org.sda.model.Person;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //Lambda expression
        Person person = new Person("Jim", "Carrey", 45);
        Predicate<Person> personTest = test -> test.getAge() > 20; //substitutes the condition we had in AdultTestPerson /lambda expression
        System.out.println(personTest.test(person));


        //Lambda expression - function interface
        //New way of writing a method: functional interface
        Function<String, Integer>  getStringLen = s ->{
            int increment = 10;
            s.length(); //first string is input, second is return to integer
            return s.length() + increment;
        };

        System.out.println(getStringLen.apply("Java is not easy. Joke :)"));
        //apply passes the value to string

        //Method reference
        Predicate<Person> personTest2 = Person:: isAdult; //class name :: method name
        System.out.println(personTest2.test(person));

        //Lambda expression - supplier, consumer
        //supplies the value, consumes the value

        //supplier: it doesn't take ant arguments, but returns only the value
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        System.out.println(randomNumberSupplier.get()); //get() should be always called
        // () - if you don't have any value to pass

        //consumer - just takes an argument and returns nothing
        Consumer<Person> printPersonValues = p -> System.out.println("Person first name: " + p.getFirstName() + " last name: " + p.getLastName());
        printPersonValues.accept(person); //accept() should always called

        //Lambda expression - operator
        UnaryOperator<Integer> toSquare = i -> i * i;
        System.out.println(toSquare.apply(4)); //apply() should always be called




    }
}