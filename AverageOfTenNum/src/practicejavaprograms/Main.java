package practicejavaprograms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten grades: ");
        int grade;
        int total =0;
        int counter =0;
        int average;

        while (counter <10){
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        total = total/10;
        System.out.println("The average is: " +total);
    }
}
