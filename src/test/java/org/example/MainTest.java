package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void fibonacciTest_put1get0() {
        int n = 1;
        int expected = 0;

        int actual = Main.fibonacci(n);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void fibonacciTest_put10get34() {
        int n = 10;
        int expected = 34;

        int actual = Main.fibonacci(n);

        Assertions.assertEquals(expected, actual);
    }
}