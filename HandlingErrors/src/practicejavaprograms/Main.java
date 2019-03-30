package practicejavaprograms;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 1;

      //do while loop means do this while the condition is met x==1;
//if try statement works then x=2 will stop do while loop
//otherwise this will keep going while try statement wont work

        do {

         try {
             System.out.println("Enter first number");
             int num1 = input.nextInt();


            System.out.println("Enter second number");
            int num2 = input.nextInt();
            int sum =  num1 /  num2;
            System.out.println(sum);
            x = 2;
        }
        catch (Exception e) {
            System.out.println("Please enter numerals");
        }
    }while(x==1);

    }
}
