package com.company;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {

    }

    /*   public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
           this.id = id;
           this.balance = balance;
           this.annualInterestRate = annualInterestRate;
           this.dateCreated = dateCreated;
       }*/

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;

    }

    public int getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated() {
        this.dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public double getMonthlyInterestRate() {
        double monthlyInterestRate = getAnnualInterestRate()/ 12d;
        return monthlyInterestRate;

    }

    public double getMonthlyInterest() {
        double monthlyInterest = balance * getAnnualInterestRate() / 1200d;
        return monthlyInterest;

    }

    public double withdraw(double withdraw) {
        balance = balance - withdraw;
        return balance;

    }

    public double deposit(double deposit) {

        balance = balance + deposit;
        return balance;

    }


}
