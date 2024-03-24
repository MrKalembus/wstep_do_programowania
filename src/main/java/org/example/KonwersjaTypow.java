package org.example;

public class KonwersjaTypow {
    public static void main(String[] args) {
        int cookies = 5;
        float brokenCookies = cookies;
        System.out.println(cookies);
        System.out.println(brokenCookies);

        double doubleNumber = 99.97;
        System.out.println(doubleNumber);
        int intNumber = (int)doubleNumber;
        System.out.println(intNumber);
        doubleNumber = intNumber;
        System.out.println(doubleNumber);

        doubleNumber = 99.50;
        intNumber = (int)Math.round(doubleNumber);
        System.out.println(intNumber);

        doubleNumber = 99.49;
        intNumber = (int)Math.round(doubleNumber);
        System.out.println(intNumber);
    }
}