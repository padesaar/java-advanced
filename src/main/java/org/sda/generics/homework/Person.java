package org.sda.generics.homework;

public class Person implements Comparable2<Person> {

    private int height;


    public Person(int height) {this.height = height;}

    @Override
    public boolean isTaller(Person item) {return this.height > item.height;}

    public boolean compareTo(Person person2) {return this.height > person2.height;}
}

/**
 * In main class (line 224):
 *
 *   //Homework (Generics, comparable)
 *         Person person1 = new Person(189);
 *         Person person2 = new Person (170);
 *         System.out.println("Person 1 is taller than person 2: " + person1.isTaller(person2));
 *         System.out.println(person1.compareTo(person2));
 *
 *
 *
 */


