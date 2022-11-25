package ch.juventus.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank(50_000);
    }

    @Test
    void withdraw() {
        assertFalse(bank.withdraw(-100));
        assertFalse(bank.withdraw(0));
        assertEquals(50_000d, bank.retrieveBalance(), "wrong balance");
        bank.withdraw(5_000);
        assertEquals(45_000d, bank.retrieveBalance(), "wrong balance");
    }

    @Test
    void deposit() {
        assertFalse(bank.deposit(-100));
        assertFalse(bank.deposit(0));
        assertEquals(50_000d, bank.retrieveBalance(), "wrong balance");
        bank.deposit(5_000);
        assertEquals(55_000d, bank.retrieveBalance(), "wrong balance");
    }

    @Test
    void retrieveBalance() {
        assertEquals(50_000d, bank.retrieveBalance(), "wrong balance");
    }
}