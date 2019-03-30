package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterestRate(10000.0, 2.0));
//        //initialization - terminations - incrementation
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Loop " + i + " Hello");
//
//        }
        //isPrime(5);


        int count = 0;
        for(int i=10; i<50; i++ ){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }







        //you can use the variable 'i' again in another for loop and also in the output and for a parameter.
        //loop just repeat things to your needs
       for (int i = 2; i<9; i++){
            System.out.println("£10,000 at " + i + " % = " + calculateInterestRate(10000.0, i));
        }

        System.out.println("************************************************************************");

        //this is the reversing the loop above
        for (int i = 8; i>=2; i--){
            System.out.println("£10,000 at " + i + " % = " + calculateInterestRate(10000.0, i));
        }

    }
      //this method carries out calculation of the amount and the interest rate
    public static double calculateInterestRate (double amount, double interestRate){
        double newAmount = amount * (interestRate/100);
        return newAmount ;

    }


    public static boolean isPrime (int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
