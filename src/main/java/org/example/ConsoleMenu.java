package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleMenu {
    FinanceService financeService = new FinanceService();
    Scanner sc = new Scanner(System.in);
    int choose;

    public void consoleMenu() {
        System.out.println("Welcome");
        while (true) {
            System.out.println("""
                    Choose an action:
                    1. View balance
                    2. Add income
                    3. Add expense
                    4. View Savings
                    0. Exit
                    """);
            choose = sc.nextInt();
            if
            (choose == 1) {
                System.out.println(financeService.getBalance());
            } else if (choose == 2) {
                MenuIncome();

            } else if (choose == 3) {
                MenuExpense();
            } else if (choose == 0)
                return;
            else if (choose == 4) {
                  MenuSaving();
            } else
                System.out.println("invalid input. Please try again");
        }
    }

    private void MenuExpense() {
        System.out.println("""
                Choose a wallet:
                1. Balance
                2. Savings
                0. Exit
                """);
        int wallet = sc.nextInt();
        if (wallet == 0) {
            return;
        } else if (wallet == 1) {
            System.out.println("Enter Expense: ");
            double amount = sc.nextDouble();
            financeService.addExpenses(wallet, amount);
        } else if (wallet == 2) {
            System.out.println("""
                    Are you sure you want to use your savings?
                    1.yes / 0.No
                    """);

            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("""
                        Enter expense:
                        0. Exit""");
                double amount = sc.nextDouble();
                financeService.addExpenses(wallet, amount);
            }


        }
    }

    private void MenuSaving() {
        System.out.println(financeService.getSavingBalance());
        System.out.println("1. Add Savings");
        System.out.println("0. Exit");
        choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("""
                    Enter the amount:
                    0. Exit""");
            double amount = sc.nextDouble();
            financeService.addSavings(amount);
        }
}
    private void MenuIncome(){
        System.out.println("""
                        Enter income:
                        0. Exit""");
        double amount = sc.nextDouble();

        financeService.addIncome(amount);
    }
}

