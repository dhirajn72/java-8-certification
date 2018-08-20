/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 19/08/18
 */

public class Transfer implements Runnable {
    Account from, to;
    double amount;

    public Transfer(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Account a1 = new Account("A1", 1000);
        Account a2 = new Account("A1", 1000);
        es.submit(new Transfer(a1, a2, 200));
        es.submit(new Transfer(a2, a1, 300));
    }

    public void run() {
        synchronized (from) {
            from.setBalance(from.getBalance() - amount);
            synchronized (to) {
                to.setBalance(to.getBalance() + amount);
            }
        }
    }
}

class Account {
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}




