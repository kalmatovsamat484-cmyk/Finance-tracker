package org.example;

public class Budget {

    private double totalIncome;
    private double totalExpense;
    private double totalSaving;

    public Budget( double totalIncome, double totalExpence, double totalSaving){
        this.totalExpense=totalExpence;
        this.totalIncome=totalIncome;
        this.totalSaving=totalSaving;
    }
    public double getBalance(){
        return totalIncome-totalExpense-totalSaving;
    }


}
