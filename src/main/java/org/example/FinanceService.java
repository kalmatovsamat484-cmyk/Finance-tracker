package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FinanceService {
    ArrayList<Income> incomes= new ArrayList<>();
    ArrayList<Expense> expences= new ArrayList<>();
    public void addIncome (Income income){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income:");
        double enterIncome= sc.nextDouble();
        if (enterIncome < 0){
            System.out.println("Income cannot be negative");
        }
        else
            incomes.add(new Income(enterIncome));
    }
    public void addExpenses (Expense expense){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expense:");
        double enterExpense= sc.nextDouble();
        if (enterExpense < 0){
            System.out.println("Expense cannot be negative");
        }
        else
            expences.add(new Expense(enterExpense));
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
        for (Expense i: expences){
            sumExpenses += i.getExpense();
        }
        return sumExpenses;
    }
    public double getBalance(){
        Budget budget = new Budget(getTotalIncome(), getTotalExpenses());
        return budget.getBalabce();
    }

}

