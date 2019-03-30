package practicejavaprograms;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String firstNum = JOptionPane.showInputDialog("Enter first number");
        String secondNum = JOptionPane.showInputDialog("Enter second number");
        String thirdNum = JOptionPane.showInputDialog("Enter third number");
        String fourthNum = JOptionPane.showInputDialog("Enter fourth number");

        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        int num3 = Integer.parseInt(thirdNum);
        int num4 = Integer.parseInt(fourthNum);

        int sum = num1 + num2 + num3 + num4;

        JOptionPane.showMessageDialog(null, "The total is" + sum, "Sum of four numbers",JOptionPane.PLAIN_MESSAGE );

        //Hooray this is my first GUI


    }
}
