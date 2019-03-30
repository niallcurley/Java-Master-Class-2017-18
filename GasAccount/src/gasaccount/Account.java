/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasaccount;

/**
 *
 * @author niall
 */
public class Account {
    private int intAccRefNo;//account reference number
    private String strName;//account holders name
    private String strAddress;//address of account holder
    private double dblBalance;//balance in £
    private double dblUnits;//quantity of units
    private double dblUnitCost;//price per unit 
    //Field Variables
    //Properties of Gas Account
    
public Account (int intNewAccRefNo, String strNewName, String strNewAddress,
        double dblNewUnits){
    this.intAccRefNo = intNewAccRefNo;
    this.strName = strNewName;
    this.strAddress = strNewAddress;
    //this.dblBalance = dblBalance;
    this.dblUnits = dblNewUnits;
    this.dblUnitCost = 0.02;
    
    
    dblBalance = dblNewUnits * dblUnitCost;
}//end of constructor one

public Account (int intNewAccRefNo, String strNewName, String strNewAddress){
    this.intAccRefNo = intNewAccRefNo;
    this.strName = strNewName;
    this.strAddress = strNewAddress;
    //this.dblBalance = dblBalance;
    double dblNewUnits = 0.0;
    this.dblUnitCost = 0.02;
    
    
    dblBalance = dblNewUnits * dblUnitCost;  
}

public void deposit (double dblDepositAmount){
    dblBalance = dblBalance - dblDepositAmount;
    
}

public void recordUnits (double dblUnitsUsed){
    dblBalance = dblBalance + (this.dblUnitCost * dblUnitsUsed);
    System.out.println ("Transaction Successful");
}

public int getAccRefNo(){
    return intAccRefNo;
}

public String getName(){
    return strName;
}

public String getAddress(){
    return strAddress;
}

public double getBalance(){
    return dblBalance;
}

public double getUnitCost(){
    return dblUnitCost;
}

public double getUnits(){
    return dblUnits;
}

public double updateUnitCost(double dblNewUnitCost){
    dblNewUnitCost = dblUnitCost - dblUnitCost + dblNewUnitCost;
    return dblNewUnitCost;
}




        


    
}//end of class
