package com.company;

public class Main {

    public static void main(String[] args) {

        String[] words = new String[3];

        words[0] = "Hello ";
        words[1] = " My ";
        words[2] = " Friend";

        System.out.println(words[0] + words[1] + words[2]);

        String[] fruits = {"Apple", "Orange", "Pears", "Bannanas"};

        System.out.println(fruits [1]);


        int [] numbers = new int [5];

        numbers [0] = 22;
        numbers [1] = 44;
        numbers [2] = 54;
        numbers [3] = 79;
        numbers [4] = 123;
        //numbers [5] = 346;

        for(int i=0; i<numbers.length; i++){
            System.out.println("Element " +i+ " a value of " + numbers [i]);
        }


//        System.out.println("Element no 0 = " + numbers [1]);
//        System.out.println("Element no 0 = " + numbers [2]);



        double [] mydoubles = {1.2,1.9,2.6,4.7};
        System.out.println("My value is " +mydoubles [2]);

        for(double myNumbersDouble: mydoubles){
            System.out.println(myNumbersDouble);
        }


        String [] myStrings = {"John", "Peter", "Paul", "Andrew"};
        System.out.println(myStrings[3]);


        //a way to use a for loop for printing all values of an array.
        for(String names: myStrings){
            System.out.println(names);
        }


        String [] myNewStrings = new String[3];

        myNewStrings [0] = "Harry";
        myNewStrings [1] = "Jordan";
        myNewStrings [2] = "Wesley";
        //myNewStrings [3] = "Sean";

        System.out.println(myNewStrings [2]);
        System.out.println(myNewStrings [0]);
        System.out.println(myNewStrings [1]);
        //System.out.println(myNewStrings [3]);

        int [] myNumbers = {8,7,3,7,11,444,6675,111234,};

        System.out.println("Element no 1 = " + myNumbers [1]);

        //for(int i=0; i<myNumbers.length; i++)

        for(int allNumbers: myNumbers){
            System.out.println(allNumbers);
        }

        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");

        String names = null;

        System.out.println(names);

        String [] newStrings = new String[4];

        System.out.println(newStrings [0]);

        newStrings [0] = "Im starting to get hungary ";

        System.out.println(newStrings[0]);
















    }
}
