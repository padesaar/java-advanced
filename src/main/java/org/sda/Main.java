package org.sda;

import org.sda.generics.*;
import org.sda.generics.homework.Person;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")

        //GENERIC TYPES
        // it a generic type class of interface that is parametrized over types
        //common types

        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); //converting a double to big decimal

        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "I'm a great developer";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person");
        System.out.println(genericFoodWithString.getItem());

        //Generic type extends class
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());


        //Generic type interface
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than snack 2:" + snack1.isBetter(snack2));

        //E, T - element type
        //• K - key type
        //• V - value type
        //• T - type
        //• N - number type
        //• S, U, V if there are more parametrized types


        //COLLECTIONS - group of same type
        //list or array of same type
        //List - ordered list of elements, duplicates
        //Set - set of elements, no duplicate
        //Map - it's a dictionary, storage keys and values

        //Key of 0 refers to Skoda, 1 refers to BMw and so on
        // 0 is key, skoda is value
        //list is generic type, starts with index of 0
        //list extends the collection interface

        //List

        List<String> animalList = new ArrayList<>();
        //add item to list
        animalList.add("Lion"); //index 0
        animalList.add("Tiger"); //1
        animalList.add("Rabbit"); //2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Monkey");
        animalList.add("Panda");


        System.out.println(animalList.get(1)); //print tiger
        animalList.remove(1); //tiger will be deleted
        animalList.remove("Rabbit");
        //animalList.removeAll();
        //loop the list
        for(String animal: animalList){
            System.out.println(animal); //it will loop and print all the values of the list
        }

        //iterator is similar to scanner.next
        //it's so that we can loop items on the list
        Iterator<String> stringIterator = animalList.listIterator();
        while(stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ,"); //gives the value of next item on the list
        }

        //remove all
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);
        for(String animal: animalList){
            System.out.println(animal); //it will loop and print all the values of the list
        }

        //exercise
        //in separate branch

        //Set
        //can't contain duplicates
        Set<String> countrySet = new HashSet<>(); //non-sorted, randomly stored
        countrySet.add("Eesti");
        countrySet.add("Saksamaa");
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        countrySet.add("EESTI"); //case-sensitive, so it can be added
       // countrySet.add("Eesti"); - duplicates not allowed

        //in Set if you want to get the value, you have to use for loop
        for(String country: countrySet){
        System.out.println(country);
        //prints in different järjekord because items are based on hash value - like memory value

    }

        //Set exercise
        //use scanner
        //ask whether user wants to add new color , if false - display whole set to the user
        //and then ask which color you want to delete
        //then when he wants to delete more, til he wants
        //see the list exercise
        //feature/set-exercise from initial commit
        //sort the set - TreeSet

        //before sorting
        System.out.println("Before sorting:" + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet<>(countrySet);
        //stored as sorted
        System.out.println("After sorting:" + countryTreeSet); //alphabetical order


        //Map
        //map is an object that maps keys to values.
        //map cannot contain duplicate keys: each key can map only map at most to one value
        //values  can be string, numbers..
        //getKey
        //getValue
        //map we dont use add, we use put

        //Map-exercise
        Map<String,String> fullName = new HashMap<>(); //not stored as sorted
        fullName.put("Kätlin", "Padesaar");
        fullName.put("Jason", "Statham");
        fullName.put("Jim", "Carrey");
        //fullName.put("Jim", "Mahoney"); -> duplicate key not allowed
        System.out.println(fullName);

        System.out.println(fullName.get("Jim"));
        System.out.println(fullName.remove("Kätlin"));
        System.out.println(fullName);

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Jim", 65);
        ageMap.put("Jason", 55);
        ageMap.put("Kätlin", 32);

        //map of List
        Map<String, List<String>> friendsMap = new HashMap<>();
        List<String> jimFriends = List.of("Simon", "Bruce");
        List<String> jasonFriends = List.of("Simon", "Bruce");
        List<String> katlinFriends = List.of("Simon", "Bruce");

        friendsMap.put("Jim",jimFriends);
        friendsMap.put("Jason", jasonFriends);
        friendsMap.put("Kätlin", katlinFriends);

        //map of map
        Map<String, Map<String, String>> detailMap = new HashMap<>();
        Map<String, String> jimInfoMap = new HashMap<>();
        jimInfoMap.put("age", "45");
        jimInfoMap.put("birthplace", "USA");
        jimInfoMap.put("phone", "3258983525");

        detailMap.put("Jim", jimInfoMap);
        //and so on for the others as well


        //ANNOTATIONS
        //inform the compiler about code structure
        //tools can process annot. to generate code for ex. @override
        //main syntax is @ and then type annot. name
        //some annot. are parametrized, eg Warnings("unchecked")

        //    public static void main(String[] args) {
        //        @SuppressWarnings("unchecked") -> you have to put it here

        //INPUT-OUTPUT
        //a File object represents a file
        //it can be created passing the path to it's constructor
        //path can be either absolute or relative
        //absolute - full path of the file
        //relative - only file name, but it should be in your project

        File absoluteFile = new File("C:\\Users\\37253\\java-advanced\\src\\main\\resources\\myText.txt");
        File relativeFile = new File("myText.txt");

        try{
            FileReader fileReader = new FileReader(absoluteFile);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteFile));
            String fileLine; //line of text from the file

            while((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //File writing

        try {
            FileWriter fileWriter = new FileWriter(absoluteFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String fileLine = "\n I can write and error-less Java code :D";
            bufferedWriter.write(fileLine);
            bufferedWriter.flush();
            bufferedWriter.write(fileLine);
            bufferedWriter.close();

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
        //Homework (Generics, comparable)
      //  Person person1 = new Person(189);
        //Person person2 = new Person (170);
        //System.out.println("Person 1 is taller than person 2: " + person1.isTaller(person2));
        //System.out.println(person1.compareTo(person2));


        //I/O Serializable
        //you should be able to write/read object
        //convert some object to the string
        //de-serilization - create an object from string
        //serializable is an interface that is already in java

        //old school way before java 8
        String fileName = "file.ser";

        try{
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(fruit);
            outputStream.close(); //close the writing
            file.close(); //close the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //deserialized

        Fruit deserializedFruit;

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            deserializedFruit = (Fruit) in.readObject();

            in.close();
            file.close();
            System.out.println(deserializedFruit.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // new I/O //came after java 8
        Path absolutePath = Paths.get(("C:\\Users\\37253\\java-advanced\\src\\main\\resources\\myText.txt"));
        Path relativePath = Paths.get("myText.txt");

        //file reading
        //UTF-8 is character encoding standard, for reading/writing the file
        try{
            List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);

            //just to print the file which was read above
            for(String fileLine: fileLines){
                System.out.println(fileLine);
            }

            //file-writing
            List<String> fileLinesToWrite = List.of("I love Java", "Estonia is my country");
            Files.write(absolutePath, fileLinesToWrite, StandardOpenOption.APPEND);
            //append - this adds it to the present file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Files.createDirectory(path)
        //Files.isDirectory(relativePath)

        //CONCURRENCY in JAVA
        //Lambda expression - representation of implementation



    }
    }
