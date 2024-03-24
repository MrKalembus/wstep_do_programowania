package org.example;

public class OperatoryInkrementacji {
    public static void main(String[] args) {
        int numberOfCars = 0;
        System.out.println("Początkowa ilość posiadanych aut: " + numberOfCars);

        numberOfCars = numberOfCars + 1;
        System.out.println("Ilość aut + 1: " + numberOfCars);

        numberOfCars += 1;
        System.out.println("Ilość aut + 1: " + numberOfCars);

        numberOfCars++; // post inkrementacja
        System.out.println("Ilość aut + 1: " + numberOfCars);

        // post inkrementacja
        int x = 0;
        System.out.println("Zadeklarowana wartość to: " + x);
        System.out.println("Wykonuję inkrementację: " + x++);
        System.out.println("Wartość po inkrementacji: " + x);

        // pre inkrementacja
        x = 0;
        System.out.println("Zadeklarowana wartość to: " + x);
        System.out.println("Wykonuję inkrementację: " + ++x);
        System.out.println("Wartość po inkrementacji: " + x);


        // dekrementacja
        numberOfCars = 3;
        numberOfCars = numberOfCars - 1;
        System.out.println("Ilość aut - 1: " + numberOfCars);

        numberOfCars -= 1;
        System.out.println("Ilość aut - 1: " + numberOfCars);

        numberOfCars--;
        System.out.println("Ilość aut - 1: " + numberOfCars);
        // post dekrementacje
        x = 0;
        System.out.println("Zadeklarowana wartość to: " + x);
        System.out.println("Wykonuję inkrementację: " + x--);
        System.out.println("Wartość po inkrementacji: " + x);

        // pre dekrementacje
        x = 0;
        System.out.println("Zadeklarowana wartość to: " + x);
        System.out.println("Wykonuję inkrementację: " + --x);
        System.out.println("Wartość po inkrementacji: " + x);
    }
}