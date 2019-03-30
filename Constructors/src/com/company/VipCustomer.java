package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {

        this("default name", 5000.0,"default@live.co.uk");//default constructor
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"jp@live.co.uk");
//        this.name = name;
//        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {//main constructor
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
