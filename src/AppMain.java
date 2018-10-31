import list.*;
import data.*;

import java.util.Arrays;

public class AppMain {


    public static void main(String[] args) {

        Person person1 = new Person("Artem", "Rogov",28);
        Person person2 = new Person("Alex","Mersh",30);
        Person person3 = new Person("Groovy","Teddy",40);
        Person person4 = new Person("Michail", "Goal",22);
        Person person5 = new Person("Johan", "Goal 22",30);


        List listPersons = new List();

        listPersons.add(person1,1);
        listPersons.add(person2,2);
        listPersons.add(person3,3);
        listPersons.add(person4,4);
        listPersons.add(person5,5);

       // listPersons.displayItem();

        //listPersons.remove(2);



        listPersons.displayItem();
    }










}
