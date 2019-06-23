package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account();



        account1.setAnnualInterestRate(4.5);
        account1.getAnnualInterestRate();
        account1.getMonthlyInterestRate();
        account1.setDateCreated();
        account1.setBalance(20000);
        account1.setId(1122);
        account1.withdraw(2500);
        account1.deposit(3000);
        DecimalFormat df = new DecimalFormat("£#,###.00");

        System.out.println("        Account Statement       ");
        System.out.println("Account ID: " + account1.getId());
        System.out.println("Date created: " + account1.getDateCreated());
        System.out.println("Balance: " + df.format(account1.getBalance()));
        System.out.println("Monthly interest: " + df.format(account1.getMonthlyInterest()));
    }
}
