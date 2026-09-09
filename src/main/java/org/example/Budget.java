package org.example;

public class Budget {

    private double totalIncome;
    private double totalExpanse;
    private double totalSaving;

    public Budget( double totalIncome, double totalExpance, double totalSaving){
        this.totalExpanse=totalExpance;
        this.totalIncome=totalIncome;
        this.totalSaving=totalSaving;
    }
    public double getBalance(){
        return totalIncome-totalExpanse-totalSaving;
    }


}
