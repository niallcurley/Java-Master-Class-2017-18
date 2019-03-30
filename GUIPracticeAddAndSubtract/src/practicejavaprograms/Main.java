package practicejavaprograms;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String fn = JOptionPane.showInputDialog("Enter your first value");
        String sn = JOptionPane.showInputDialog("Enter your second value");
        String tn = JOptionPane.showInputDialog("Enter your third value");
        String ftn = JOptionPane.showInputDialog("Enter your fourth value");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int num3 = Integer.parseInt(tn);
        int num4 = Integer.parseInt(ftn);

        int finalSum = num1 + num2 + num3 - num4;

        JOptionPane.showMessageDialog(null, "The total is" + finalSum, "Add and Subtract",JOptionPane.PLAIN_MESSAGE);

    }
}

