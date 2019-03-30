package com.company;
//the point of creating classes that you can only inheritance from one other class when using the extends principle,
// but composition allows you to compose different class and create them like variable and use any number of these classes.
public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //this constructor accepts three objects
    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp (){
    theCase.pressPowerButton();
    drawLogo();
    }

    private void drawLogo (){
        monitor.drawPixelAt (1900,800,"silver");
    }

    //three getters no longer available to our main class.
    private Case getTheCase() {
        return theCase;
    }

//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
