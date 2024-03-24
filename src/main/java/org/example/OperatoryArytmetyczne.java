package org.example;

public class OperatoryArytmetyczne {
    public static void main(String[] args) {
        int numberOfDarkCookies = 5;
        int numberOfLightCookies = 10;
        int allCookies = numberOfDarkCookies + numberOfLightCookies;

        System.out.println("Wszystkie ciastka: " + allCookies);

        allCookies = numberOfDarkCookies - numberOfLightCookies;

        System.out.println("Odejmowanie ciastek: " + allCookies);

        allCookies = numberOfDarkCookies * numberOfLightCookies;

        System.out.println("Mnożenie ciastek: " + allCookies);

        allCookies = numberOfDarkCookies / numberOfLightCookies;

        System.out.println("Dzielenie ciastek: " + allCookies);

        allCookies = numberOfDarkCookies % numberOfLightCookies;

        System.out.println("Reszta z dzielenia ciastek: " + allCookies);

        Double allCookiesDouble = (double) (numberOfDarkCookies / numberOfLightCookies);

        System.out.println("Reszta z dzielenia ciastek: " + allCookiesDouble);

        allCookiesDouble =  (double) numberOfDarkCookies / numberOfLightCookies;

        System.out.println("Reszta z dzielenia ciastek: " + allCookiesDouble);

        // reszta z dzielenia
        int a = 4;
        int b = 9;
        System.out.println("Dzielenie wartości: " + (b / a));
        System.out.println("Reszta z dzielenia wartości: " + (b % a));

        int isEven = 8;

        System.out.println(isEven % 2 == 0);

    }
}