package org.example;

public class KlasaString {
    public static void main(String[] args) {
        String myText = "To jest text"; // tworzenie obiektu typu String za pomocą 'iterału'
        String myText2 = "To jest text"; // takie obiekty trafiają do 'string pool'
        System.out.println("Porównanie obiektów z string pool, tworzenie iterałem");
        boolean equalString = myText == myText2; // czy obiekty mają tą samą referencje do pamieci
        System.out.println("'==' : " + equalString);

        boolean areStringTheSame = myText.equals(myText2); // sprawdza czy zawartość obiektu jest taka sama
        System.out.println("equals() : " + areStringTheSame);

        String myText3 = new String("To jest text"); // tworzenie obiektu typu String za pomocą konstruktora
        String myText4 = new String("To jest text");// takie obiekty trafiają do pamięci ogulnej
        System.out.println("Porównianie obiektów tworzonych konstruktorem, w normalnej pamięci");
        equalString = myText3 == myText4;
        System.out.println("'==': " + equalString);

        areStringTheSame = myText3.equals(myText4);
        System.out.println("equals(): " + areStringTheSame);

        String ala = "ala";
        String ma = "ma";
        String kota = "kota";

        String alaMaKota = ala + " " + ma + " " + kota; // łączenie 'String' za pomocą znaku '+', nazywamy Konkatenacją
        ala = ala + " " + ma + " " + kota;
        System.out.println(alaMaKota);
        System.out.println(ala);

        String finalText = ma.concat(kota);
        System.out.println(finalText);

        String myVar = new String("This String is String!");
        String str = "OK";
        String joined = String.join("-", myVar, str, "xyz");// This String is String!-OK-xyz
        System.out.println(joined);

        System.out.print("Jarek \n\n");
        System.out.println("\t\t\tJarek");
        System.out.printf("Ile z %d jajek ma %s.%n", 8, kota);
        System.out.println(String.format("Ile z %d jajek ma %s", 8, kota));

        System.out.printf("My cat, %s, is %d years old.%n", "Filemon", 8);

        String text10 = "Jestem przykładowym tekstem";
        System.out.println(text10.indexOf("przykładowym"));
        System.out.println(text10.replaceAll("e", "E"));
        System.out.println(text10.replaceAll("tekstem", "daniem"));

        float floatNumber = 100 / 2.4f;
        System.out.println("Wartość bez formatowania " + floatNumber);
        System.out.printf("Wynik dzielenia '100 / 2.4f' = %5.6f", floatNumber);
    }
}