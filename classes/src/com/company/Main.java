package com.company;

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car();//created an object - the object 'porch is now a 'class'.
	Car holden = new Car();//created an object
    //the 'new' keyword is a way of initializing what you are doing.
        
        porsche.setModel("911");//creating an instance of an object
        System.out.println("Model is " + porsche.getModel());

    }
}
