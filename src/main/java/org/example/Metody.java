package org.example;

public class Metody {
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public boolean areEven(int number){
        return number % 2 == 0;
    }
    public static void printEven(int number){
        if(isEven(number)) {
            System.out.println("Parzysta");
        }else System.out.println("Nie parzysta");
    }

}