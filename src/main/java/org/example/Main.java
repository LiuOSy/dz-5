package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int sumAB = a + b;
        int sumCD = c + d;

        boolean diff1 = sumAB < sumCD;
        System.out.printf("Is the first sum less than the second? %b%n", diff1);

        sumAB++;
        sumCD -= 2;

        boolean diff2 = sumAB > sumCD;
        System.out.printf("Is the first sum greater than the second? %b%n", diff2);

        System.out.println(sumAB % 2 == 0 || sumCD % 2 == 0);
    }
}