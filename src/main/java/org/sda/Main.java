package org.sda;

import jdk.jshell.spi.ExecutionControl;
import org.sda.concurrency.StopWatchRunnableImpl;
import org.sda.concurrency.StopWatchThread;
import org.sda.concurrency.synchronization.ShoppingCart;
import org.sda.concurrency.synchronization.ShoppingCartThread;
import org.sda.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Lambda expression
        Person person = new Person("Jim", "Carrey", "jimmy", 45);
        Predicate<Person> personTest = test -> test.getAge() > 20; //substitutes the condition we had in AdultTestPerson /lambda expression
        System.out.println(personTest.test(person));


        //Lambda expression - function interface
        //New way of writing a method: functional interface
        Function<String, Integer> getStringLen = s -> {
            int increment = 10;
            s.length(); //first string is input, second is return to integer
            return s.length() + increment;
        };

        System.out.println(getStringLen.apply("Java is not easy. Joke :)"));
        //apply passes the value to string

        //Method reference
        Predicate<Person> personTest2 = Person::isAdult; //class name :: method name
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

        //OPTIONALS
        //it's a class, not an interface
        //it's a wrapper that can used if we are not sure if a value is present
        //best way to explain - candy wrapper
        //it can be filled with values and it may not be
        Person person3 = new Person("Tony", "Chaplan", "stark", 56);
        Optional<Person> optionalPerson = Optional.of(person3);


        if (optionalPerson.isEmpty()) {
            System.out.println("Person cannot be printed");
        } else {
            System.out.println(optionalPerson.get().toString());
        }

        optionalPerson.ifPresent(System.out::println); //ut was lambda expression
        System.out.println(getRandomPerson().toString());

        //STREAMS
        //can be used to perform operations on collections with usage of lambda expressions
        //help you do the work faster, we don't need so many for-s and if-s and no new list
        //Streams - collect, findFirst, findAny
        // we use streams when we have a list
        List<String> carList = List.of("BMW", "Skoda", "Toyota", "Audi", "Ford");
        carList.get(0); //one way to get the value
        carList.stream()
                .findFirst()
                .ifPresent(System.out::println); //using the streams to get the value
        //findFirst() -> Optional<T>
        carList.stream()
                .findAny()
                .ifPresent(System.out::println); //find random element of this array
        //findAny() -> Optional<T>
        //filter is used ti apply a condition to the list and filter the list
        List<String> filteredCars = carList.stream()
                .filter(s -> s.length() >= 5) //Filter returns Stream<T>
                .collect(Collectors.toList()); //convert Stream<T> to List<T>

        filteredCars.stream().forEach(System.out::println); //prints all the values
        filteredCars.forEach(s -> {
            String prefix = "Car: " + s;
            System.out.println(prefix);
        });

        //Streams - filter and map
        //map: used to apply an operation to all the elements in the list(does not filter)

        List<Integer> carLength = carList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        carLength.forEach(System.out::println);
        System.out.println(carLength.size());

        //AnyMatch, allMatch

        //allMatch us used to check all the elements in the List matching a given condition
        boolean isAllCarsGreaterThanFive = carList.stream()
                .allMatch(s -> s.length() >= 5); //s = listis kõigepealt 1 element, siis teine jne.. loopib
        System.out.println(isAllCarsGreaterThanFive);

        //anyMatch
        //used to check if at least one element in the list matches the given condition
        boolean isAnyCarStartingWithB = carList.stream()
                .anyMatch(s -> s.startsWith("B"));
        System.out.println(isAnyCarStartingWithB);
        //startsWith is case-sensitive

        //Streams - reduce method - puts everything in single line
        //initial value is empty string
        //used to reduce the list to string or other type
        String cars = carList.stream()
                .reduce("", ((s, s2) -> (s.equals("") ? "" : s + ", ") + s2 ));
        System.out.println(cars);

        //Streams - forEach, sorted
        //forEach - see the examples before
        //sorted - it will sort the list in the ascending order

        carList.stream()
                .sorted() //alphabetical order by default
                .forEach(System.out::println);

        carList.stream() //descending order sorting
                .sorted((car1, car2) -> car2.compareTo(car1))
                .forEach(System.out::println);

        carList.stream() //different way of printing reverse order
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



        //NESTED CLASSES
        //non-static inner type is bound to object of outer type

        Person person4 = new Person("Jhonny", "Depp", "jhonny", 50);
        System.out.println(person4.getUsername()); //outer class - Person
        //inner class
        Person.Employee employee = person4.new Employee(); //outer class . inner class
        employee.username();
        System.out.println(person4.getUsername());

        //static nested class
        //inner class is not bound to the outer class - it can not get the value of outer class
        Person person5 = new Person("Dean", "Winchester", "winchester666", 34);
        System.out.println(person5.getUsername());

        Person.Customer customer = new Person.Customer(); //difference in object instantiation
        customer.username(person5);
        System.out.println(person5.getUsername());

        //CONCURRENCY in Java
        //multiple jobs running in the same time
        //each operation in java is called a thread
        //every application has at least one thread
        //main method - is main thread
        //Thread.sleep(5000) mean 5000 milliseconds, it will wait for 5 seconds

        System.out.println("Main is running after nested classes....");
        Thread.sleep(5000);
        System.out.println("Thread test ended!");

        //extends thread
        StopWatchThread stopWatchThread = new StopWatchThread("SW1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");
        stopWatchThread.start(); //starting the stopWatchThread
        stopWatchThread2.start();
        System.out.println("Main thread starts running...");
        Thread.sleep(5000); //this will make main matter sleep
        System.out.println("Main thread is still running..");
        Thread.sleep(3000); //also main matter
        System.out.println("Main thread end running!");

        //implementing a runnable interface
        System.out.println("Runnable stopwatch started...");
        Thread stopWatchRunnableThread = new Thread(new StopWatchRunnableImpl());
        stopWatchRunnableThread.start();

        Thread.sleep(10000);
        //synchronization
        ShoppingCart shoppingCart = new ShoppingCart(200); //maximum limit of products in the cart
        ShoppingCartThread shoppingCartThread1 = new ShoppingCartThread(shoppingCart);
        ShoppingCartThread shoppingCartThread2 = new ShoppingCartThread(shoppingCart);
        shoppingCartThread1.start();
        shoppingCartThread2.start();
        System.out.println("Number of products:" + shoppingCart.getNumberOfProducts());

    }

    //orElse example for OPTIONAL
    private static Person getRandomPerson() {
        // Optional<Person> optionalPerson = Optional.empty();
        Optional<Person> optionalPerson = Optional.of(new Person("Captain", "Estonia", "cappy", 34));
        Person person2 = new Person("Jim", "Carrey", "carry", 56); //Backup substitute
        return optionalPerson.orElse(person2);
    }


}