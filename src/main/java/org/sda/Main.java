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

    }
}