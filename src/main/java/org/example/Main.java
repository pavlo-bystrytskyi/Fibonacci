package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }

    public static int fibonacci(int n) {
        int first = 0;
        int second = 1;
        if (n == 1) {
            return first;
        }
        if (n == 2) {
            return second;
        }
        int acc = 0;
        for (int i = 3; i <= n; i++) {
            acc = first + second;
            first = second;
            second = acc;
        }

        return acc;
    }
}