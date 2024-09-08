package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testEsPalindromo2() {
        assertTrue(Main.esPalindromo2("aca"));
        assertFalse(Main.esPalindromo2("acas"));
        assertTrue(Main.esPalindromo2("h"));
        assertFalse(Main.esPalindromo2(200));
        assertTrue(Main.esPalindromo2(""));
        assertTrue(Main.esPalindromo2("aaabccbaaa"));
        assertFalse(Main.esPalindromo2("ahabccbaaa"));
        assertTrue(Main.esPalindromo2("La tele letal"));
    }

    @Test
    void testEsPalindromo() {
        assertTrue(Main.esPalindromo(""));
        assertFalse(Main.esPalindromo("Ana"));
        assertTrue(Main.esPalindromo("a n a"));
        assertTrue(Main.esPalindromo("a"));
        assertTrue(Main.esPalindromo("@@@"));
        assertTrue(Main.esPalindromo("aca"));
        assertFalse(Main.esPalindromo("acas"));
        assertTrue(Main.esPalindromo("h"));
    }
}
