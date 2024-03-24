package org.example;

public class OperatoryPorownania { // znane jako operatory relacji
    public static void main(String[] args) {
        int numberOfDarkCookies = 5;
        int numberOfLightCookies = 5;

        boolean result = numberOfDarkCookies == numberOfLightCookies;
        System.out.println("Czy mam tyle samo ciastek jasnych i ciemnych: " + result);
        result = numberOfDarkCookies != numberOfLightCookies;
        System.out.println("Czy mam tyle samo ciastek jasnych i ciemnych: " + result);
        System.out.println(numberOfDarkCookies < numberOfLightCookies);
        System.out.println(numberOfDarkCookies <= numberOfLightCookies);
        System.out.println(numberOfDarkCookies >= numberOfLightCookies);
        System.out.println(numberOfDarkCookies > numberOfLightCookies);
    }
}