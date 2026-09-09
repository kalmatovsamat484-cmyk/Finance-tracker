package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleMenu {
    FinanceService financeService= new FinanceService();
    Scanner sc = new Scanner(System.in);
    int choose;
    public void consoleMenu(){
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
        (choose == 1){
            System.out.println(financeService.getBalance());
        }
        else if (choose==2){
            financeService.addIncome();
        }
        else if (choose==3){
            financeService.addExpenses();
        }
        else if (choose==0)
            return;
        else if (choose==4){
            System.out.println(financeService.getSavingBalanse());
            System.out.println("1. Add Sevings");
            System.out.println("0. Exit");
            choose= sc.nextInt();
            if (choose==1){
                financeService.addSavings();
            }
        }
        else
            System.out.println("invalid input. Please try again");
    }
}
}
