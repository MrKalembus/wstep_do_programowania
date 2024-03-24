package org.example;

public class PentlaWhile {
    public static void main(String[] args) {
        int donutsNumber = 1;
        while (donutsNumber < 60) {
            System.out.println("Zjadłem " + donutsNumber + " pączki");
            if (donutsNumber == 10) {
                System.out.println("Będzie Cie boleć brzuszek");
                break;
            }
            System.out.println("tekst na koniec");
            donutsNumber++;
        }

//        while (donutsNumber < 60){
//            System.out.println("Zjadłem " + donutsNumber + " pączki");
//            if(donutsNumber == 10){
//                System.out.println("Będzie Cie boleć brzuszek");
//                continue; // zastosowanie polecenia stworzy nam pętle nieskończoną
//            }
//            System.out.println("tekst na koniec");
//            donutsNumber++; // dla wartości 10 nigdy nie wejdzie w zwiększanie zmiennej
//        }

        while (donutsNumber++ < 60) { // inkrementacja po użyciu zmiennej do sprawdzenia warunku
            System.out.println("Zjadłem " + donutsNumber + " pączki");
            if (donutsNumber == 10) {
                System.out.println("Będzie Cie boleć brzuszek");
                continue;
            }
            System.out.println("tekst na koniec");
        }

        int numberOfapples = 10;
        do {
            System.out.println("Zjadłem " + numberOfapples + " jabłek");
            numberOfapples++;
        } while (numberOfapples < 15);
    }
}