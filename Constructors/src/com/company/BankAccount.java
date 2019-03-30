package com.company;

public class BankAccount {

    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //creating a default constructor
    public BankAccount (){

        this(000000,0.0,"Lee Harvey Oswald", "defaultemail.co.uk","defaultnumber");
    }

    //field values can be set using constructors instead of individual setters. This is a faster way to do setters.
    //only the access modifier and the name of the class.
    //the purpose of the constructor is to initialize the object that you are creating. Faster than individual setters



    public BankAccount (int accNumber, double balance, String name, String email, String phoneNumber){
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(1000,1000.0,name, email,phoneNumber);//default values for overloaded constructor
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPhoneNumber() {

        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public int getAccNumber() {

        return accNumber;
    }

    public void setAccNumber(int accNumber) {

        this.accNumber = accNumber;
    }

    //public int getAccNumber() {

        //return accNumber;
    //}

  //  public void setAccNumber(int accNumber) {
   //     this.accNumber = accNumber;
   // }

    //    public void setAccNumber (int accNumber ) {
//        this.accNumber = accNumber;
//    }
//
//    public int getAccNumber (){
//        return this.accNumber;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public int getPhoneNumber() {
//        return this.phoneNumber;
//    }

    public void depositAmount (double deposit){
    balance = balance + deposit;
        System.out.println("With deposit of " + deposit + " the New Balance is " + balance);
    }

    public void withDrawAmount (double withDraw){
        if(balance - withDraw <=0){
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        //this.balance = this.balance - withDraw;
        //if (this.balance <=0.0){
           // System.out.println("Only " + balance + " Left In Account");
        }else {
            balance -= withDraw;
            System.out.println("You have withdrawn " + withDraw + " leaving a balance of " + balance);
        }
    }
}
