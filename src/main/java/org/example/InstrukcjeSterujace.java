package org.example;

public class InstrukcjeSterujace {
    public static void main(String[] args) {

        System.out.println("############## IF ELSE ################");
        float bodyTemp = 36.6f;

        if (bodyTemp > 35.0F && bodyTemp < 36.6f)
            System.out.println("Jest Ci ciepło"); // gdy mamy do wykonania tylko jedną linijkę to nie trzeba określać ciała za pomocą nawiasów klamrowych
        else if (bodyTemp >= 36.6F && bodyTemp < 37f) {
            System.out.println("Masz stan podgorączkowy");
            System.out.println("Idz do lekarza");
        } else
            System.out.println("Nie udało się spełnić żadnego warunku z powyższych");

        System.out.println("Koniec metody");

        System.out.println("############## switch case ################");
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Podana wartość to 1");
                break;
            case 2:
                System.out.println("Podana wartość to 2");
                break;
            case 3:
                System.out.println("Podana wartość to 3");
                break;
            case 4:
                System.out.println("Podana wartość to 4");
                break;
            default:
                System.out.println("Nie udało się spełnić żadnego warunku z powyższych");
                break;
        }

        System.out.println("Jestem po switch");

        String valueString = "JajeczNicA";
        switch (valueString.toLowerCase()) {
            case "jajecznica":
                System.out.println("Hurra jest niedziela");
                break;
            case "chlebek":
                System.out.println("Tylko chlebek :(");
                System.out.println("nieeeee");
                System.out.println("nieeeee");
                System.out.println("nieeeee");
                System.out.println("nieeeee");
                break;
            default:
                System.out.println("Co ty jadasz: " + valueString);
        }
        System.out.println("Jestem po switch");

    }
}