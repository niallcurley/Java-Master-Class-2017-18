package com.company;

public class Main {

    public static void main(String[] args) {
	Dimensions dimensions = new Dimensions(20,20,5);

	Case theCase = new Case("220B","Dell", "240", dimensions );
	Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
	Motherboard motherboard = new Motherboard("BJ 200", "Asus", 4, 6, "Ver2 bios");

	Pc thePc = new Pc (theCase, theMonitor, motherboard);

	//new instance created, getter called and method drawPixels values entered
//	thePc.getMonitor().drawPixelAt(1500, 1200,"red");// called getMonitor from Pc.java and method drawPixelAt from Monitor.java
//	thePc.getMotherboard().loadProgram("Window 1.0");
//	thePc.getMotherboard().setCardSlots(10);
//	//thePc.getMotherboard().getCardSlots();
//        System.out.println("Number of Card Slots " + thePc.getMotherboard().getCardSlots());
//        thePc.getTheCase().pressPowerButton();
//        thePc.getMonitor().drawPixelAt(560,480,"Blue");
//        System.out.println("theMonitor.getModel()"+ theMonitor.getModel());
      thePc.powerUp();


    }
}
