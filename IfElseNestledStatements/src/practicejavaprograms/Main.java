package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        int pensionAge = 67;

        //a nested if else statement is useful when you need more than two decisions to print out.
        if(pensionAge <65){
            System.out.println("Young are not of pension age yet ");
        } else {
            System.out.println("Your a due to claim your pension");
            if(pensionAge >=75){
                System.out.println("Youve had it");
            }else {
                System.out.println("But youve still a few miles left in the tank");
            }//nested else
        }//first curly brackets of else statment

    }
}
