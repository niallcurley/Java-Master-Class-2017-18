package practicejavaprograms;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String> olympicSports = new ArrayList<>();
//
//        olympicSports.add("Boxing");
//        olympicSports.add("Snooker");
//        olympicSports.add("Archery");
//        olympicSports.add("Show Jumping");
//
//        System.out.println("There are " + olympicSports.size() + " on this list. They are: ");//   .size() means the number of strings that have been added.
//
//        for (String sport: olympicSports) {//this prints the four added olympicSports
//            System.out.println(sport);
//        }

      ArrayList<String> names = new ArrayList<>();

      names.add("Gary");
        names.add("Alice");
        names.add("Peter");
        names.add("Donald");
        names.add("Peter");
        names.add("Alex");


//        System.out.println(names.get(0));
//        System.out.println(names.get(2));
//        System.out.println(names.get(1));
//        System.out.println(names.get(4));

//        for(String listOfNames : names){
//            System.out.println(listOfNames);
//        }

//the hashmap gives a key and a value  e.g keys is "John" and the values is 34
HashMap<String, Integer> nameAndAge = new HashMap<>();

        nameAndAge.put("John", 34);
        nameAndAge.put("Paula", 34);
        nameAndAge.put("Liam", 34);
        nameAndAge.put("Sammy", 34);
        nameAndAge.put("Richard", 34);

        System.out.println(nameAndAge.size());


        for (String listOfNames1 : nameAndAge.keySet()){
            System.out.println("My name is " +listOfNames1+ " and my age is " +nameAndAge.get(listOfNames1));
        }




    }
}
