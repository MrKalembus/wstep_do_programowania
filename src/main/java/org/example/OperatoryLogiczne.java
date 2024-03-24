package org.example;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean valueTrue = true;
        boolean valueFalse = false;

        // operator '&&' - 'koniunkcja' zwraca 'true' tylko gdy obie strony działania są true
        System.out.println(valueTrue && valueFalse);
        System.out.println(valueTrue  && valueTrue);
        System.out.println(!valueTrue && valueTrue);
        System.out.println(valueFalse && valueFalse);

        // operator '||' - 'alternatywa' zwraca 'true' tylko gdy jedna strona działania są true
        System.out.println(valueTrue || valueFalse);
        System.out.println(valueTrue  || valueTrue);
        System.out.println(!valueTrue || valueTrue);
        System.out.println(valueFalse || valueFalse);
    }
}