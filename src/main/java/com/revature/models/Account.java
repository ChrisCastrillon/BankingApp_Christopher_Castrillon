package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 4982126378466798206L;

    @Id
    @GeneratedValue
    @Column(name="account_number")
    private int accountNumber;
    private double balance;
    
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Account(int accountNumber, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }

}
