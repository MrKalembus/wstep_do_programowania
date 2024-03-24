package org.example;

public class PetlaFor {

    // wydrukuj znaki z tablicy znaków o wartościach kodów od 0 do 1000
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            char znak = (char) i;
            System.out.print(i + ": " + znak + " | ");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        // index   0        1      2
        String[] pelneZdanie = {"Aleks ", "ma ", "psa"}; // dla wszystkich kolekcji danych, pierwszy element ma index 0

        for (int i = 0; i < pelneZdanie.length; i++) {
            System.out.print(pelneZdanie[i]);
        }
        System.out.println();

        for (String wyraz : pelneZdanie) {
            System.out.print(wyraz);
        }
        // domyślna wersja podpowiadana przez InteliJ
        for (String xx :
                pelneZdanie) {
            System.out.println(xx);
        }
        for (String zdanie : pelneZdanie) {
            System.out.println(zdanie);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("wartość licznika: " + i);
            if (i == 5){
                break;
            }
            System.out.println("Ostatnia linia");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("wartość licznika: " + i);
            if (i == 5 || i == 8){
                continue;
            }
            System.out.println("Ostatnia linia z continue");
        }
    }
}