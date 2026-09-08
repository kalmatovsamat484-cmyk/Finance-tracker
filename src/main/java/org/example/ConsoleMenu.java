package org.example;

import java.util.Scanner;

public class ConsoleMenu {
    FinanceService financeService= new FinanceService();
    Scanner sc = new Scanner(System.in);
    int choose;
    public void consoleMenu(){
        System.out.println("Welcome");
        System.out.println("""
                Choose an action:
                1. View balance
                2. Add income
                3. Add expense
                """);
choose = sc.nextInt();
        if
        (choose == 1){
            System.out.println(financeService.getBalance());
        }
        else if (choose==2){
            financeService.addIncome(null);
        }
        else if (choose==3){
            financeService.addExpenses(null);
        }
    }

}
