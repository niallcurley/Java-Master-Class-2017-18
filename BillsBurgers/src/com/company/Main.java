package com.company;

class Hamburger {
    private String breadType;
    private String meatType;
    private double lettuce;
    private double tomato;
    private double carrot;
    private double price;

    public Hamburger(String breadType, String meatType, double lettuce, double tomato, double carrot, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.price = price;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getLettuce() {
        return lettuce;
    }

    public double getTomato() {
        return tomato;
    }

    public double getCarrot() {
        return carrot;
    }

    public double getPrice() {
        return price;
    }

    public void basicHamburger (){
        System.out.println("Cost of Hamburger "+ getPrice());
    }

    public void lettuceAndBurger (){

        double burgerWithLettuce = getPrice()+ getLettuce();

        System.out.println("Cost for Burger with lettuce " + burgerWithLettuce);
    }

    public void lettuceTomatoBurger (){
        double lettuceTomatoBurgerCost = getPrice()+getLettuce()+getTomato();
        System.out.println("Cost for Burger with lettuce and tomato " + lettuceTomatoBurgerCost);
    }

    public void carrot (){
        double carrotCost = getPrice()+ getLettuce() + getTomato() + getCarrot();
        System.out.println("Cost for Burger with lettuce, tomato and carrot "+ carrotCost);
    }


}//hamburger class

class HealthyBurger extends Hamburger {

    private double cucumber;
    private double thousandIsland;

    public HealthyBurger(String breadType, String meatType, double lettuce, double tomato, double carrot, double price, double cucumber, double thousandIsland) {
        super(breadType, meatType, lettuce, tomato, carrot, price);
        this.cucumber = cucumber;
        this.thousandIsland = thousandIsland;
    }

    public double getCucumber() {
        return cucumber;
    }

    public double getThousandIsland() {
        return thousandIsland;
    }

    public void healthyBurgerPrice() {
        double healthyPrice = getPrice() + getCucumber() + getThousandIsland();
        System.out.println("Healthy Burger Price With Rye Bread Roll, Cucumber and Thousand Island Dressing " + healthyPrice);
    }

}

class DeluxBurger extends Hamburger {
    private double deluxExtraCost;
    private String drink;
    //private String chips;

    public DeluxBurger(String breadType, String meatType, double lettuce, double tomato, double carrot, double price, double deluxExtraCost, String drink, String chips) {
        super(breadType, meatType, lettuce, tomato, carrot, price);
        this.deluxExtraCost = deluxExtraCost;
        this.drink = drink;
        //this.chips = chips;
    }

    public double getDeluxExtraCost() {
        return deluxExtraCost;
    }

    public String getDrink() {
        return drink;
    }

    public String getChips() {
        return "Chips";
    }

    public void TotalDeluxCost (){
        double totalDeluxDeal = getPrice()+ getDeluxExtraCost();
        System.out.println("The cost of the Delux meal is "+ totalDeluxDeal+ " which includes soft drink " + getDrink()+ "and " + getChips());
    }
}


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("White Roll Bread", "Beef", 0.50, 0.45,0.25, 3.55);
        System.out.println("Type of bread "+ hamburger.getBreadType());
        System.out.println("Type of meat "+ hamburger.getMeatType());

        hamburger.lettuceAndBurger();
        hamburger.basicHamburger();
        hamburger.lettuceTomatoBurger();
        hamburger.carrot();

        HealthyBurger healthyBurger = new HealthyBurger("Rye Bread", "Chicken", 0.20,
                0.29,30.0, 3.55,0.25,0.30);

        healthyBurger.healthyBurgerPrice();

        DeluxBurger deluxBurger = new DeluxBurger("Rye bread", "Chicken", 0.25, 0.30,
                0.30, 3.50, 1.99, "Coke", "Chips");

        deluxBurger.getDeluxExtraCost();
        deluxBurger.getDrink();
        deluxBurger.TotalDeluxCost();




    }
}
