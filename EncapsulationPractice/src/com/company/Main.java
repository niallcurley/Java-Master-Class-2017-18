package com.company;
/*
Encapulation - this program is about explaining that you can only access the class and manipulate it by accessing the methods and
and not the field variables.
 */

public class Main {

    public static void main(String[] args) {
	 Printer printer = new Printer(50, true);
	 printer.printPages(0);
        System.out.println("Initial page count " + printer.getNoOfPages());

        //printer.printPages(18);
        System.out.println("Total page count " + printer.getNoOfPages());

        //printer.printPages(18);
        System.out.println("Total page count " + printer.getNoOfPages());

        //printer.addToner(77);
        System.out.println("Toner level "+ printer.getTonerLevel() + "%");

    }
}
