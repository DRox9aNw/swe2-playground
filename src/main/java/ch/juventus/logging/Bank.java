package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {
    final Logger logger = LoggerFactory.getLogger(Bank.class);
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
        logger.info("new Account with initial balance of {}", balance);
    }

    public boolean withdraw(Number amount) {
        if (amount.doubleValue() <= 0) {
            logger.warn("withdraw amount ({}) <= 0", amount);
            return false;
        }
        if (amount.doubleValue() > balance) {
            logger.warn("withdraw amount ({}) > balance", amount);
            return false;
        }
        balance -= amount.doubleValue();
        logger.info("withdraw of {} successful", amount);
        return true;
    }

    public boolean deposit(Number amount) {
        if (amount.doubleValue() <= 0) {
            logger.warn("deposit amount ({}) <= 0", amount);
            return false;
        }
        balance += amount.doubleValue();
        logger.info("deposit of {} successful", amount);
        return true;
    }

    public Number retrieveBalance() {
        return balance;
    }
}
