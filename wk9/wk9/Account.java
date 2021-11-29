// Assignment 9.7 - Account class
// this program will create an account for a user
package wk9;
import java.util.Date; // ~ Depreciated ~ Some issues 

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate; 
    public Date dateCreated; 



    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /** 
     * Setters:
     *      This group of methods will change or set the values for the id, date, balance, & the annual interest rate
    */
    public void setId(int id){
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAnnaulInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    /** 
     * Getters: 
     *      This group of methods will get the values for the id, date, balance, & the annual interest rate & return them
    */
    public Date getDateCreated() {
        dateCreated = new Date();
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getMouthlyInterestRate() {
        return balance * (annualInterestRate / 12 ) / 100;
    }

    /**
     * Transactions:
     *      This group of methods will change or set the value of the account balance
    */
    public void withdraw(double amount) {
        balance -= amount;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
}