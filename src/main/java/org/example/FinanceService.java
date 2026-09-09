package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FinanceService {

    ArrayList<Income> incomes= new ArrayList<>();
    ArrayList<Expense> expenses= new ArrayList<>();
    ArrayList<Savings> savings= new ArrayList<>();
    ArrayList<Expense> savingsExpenses = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addIncome (){

        System.out.println("""
                Enter income:
                0. Exit""");
        double enterIncome= sc.nextDouble();
        if (enterIncome < 0){
            System.out.println("Income cannot be negative");
        }
        else
            incomes.add(new Income(enterIncome));
    }
    public void addExpenses (){
        System.out.println("""
                Choose a wallet:
                1. Balance
                2. Savings
                0. Exit
                """);
        int choose = sc.nextInt();
        if (choose == 1){
            System.out.println("""
                Enter expense:
                0. Exit""");
            double enterExpense= sc.nextDouble();
            if (enterExpense < 0){
                System.out.println("Expense cannot be negative");
            }
            else if(getBalance() < enterExpense){
                System.out.println("Insufficient balance");
            }
            else
                expenses.add(new Expense(enterExpense));
        }
        else if (choose==2) {
            System.out.println("""
                    Are you sure you want to use your savings?
                    1.yes / 0.No
                    """);
            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("""
                        Enter expense:
                        0. Exit""");
                double enterExpense = sc.nextDouble();
                if (enterExpense < 0) {
                    System.out.println("Expense cannot be negative");
                } else if (getSavingBalanse() < enterExpense) {
                    System.out.println("Insufficient balance");
                } else
                    savingsExpenses.add(new Expense(enterExpense));
            }

        }

        }

    public double getTotalIncome(){
       double sumIncomes=0;
for (Income i: incomes){
sumIncomes += i.getIncome();
}
return sumIncomes;
    }
    public double getTotalExpenses(){
        double sumExpenses=0;
        for (Expense i: expenses){
            sumExpenses += i.getExpense();
        }
        return sumExpenses;
    }
    public double getBalance(){
        Budget budget = new Budget(getTotalIncome(), getTotalExpenses(), getTotalSavings());
        return budget.getBalance();
    }
    public void addSavings(){

        System.out.println("""
                Enter the amount:
                0. Exit""");
        double enterSavings= sc.nextDouble();
        if (enterSavings < 0){
            System.out.println("Savings cannot be negative");
        }
        else if(getBalance() < enterSavings){
            System.out.println("Insufficient balance");
        }
        else
            savings.add(new Savings(enterSavings));
    }
    public double getTotalSavings(){
        double sumSavings = 0;
        for (Savings i: savings){
            sumSavings+= i.getSavings();
        }
        return sumSavings;
    }
    public double getTotalSavingsExpenses(){
        double sum = 0;
        for (Expense i: savingsExpenses){
            sum+= i.getExpense();
        }
        return sum;
    }

    public double getSavingBalanse(){
       return getTotalSavings() - getTotalSavingsExpenses();
    }

}

