package org.example;

public class Budget {

    private double totalIncome;
    private double totalExpance;

    public Budget( double totalIncome, double totalExpance){
        this.totalExpance=totalExpance;
        this.totalIncome=totalIncome;
    }
    public double getBalabce(){
        return totalIncome-totalExpance;
    }
}
