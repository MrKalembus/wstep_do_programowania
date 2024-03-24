package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {
        // 1-wszy sposób
        Pattern p = Pattern.compile(".s"); // kropka reprezentuje pojedyńczy znak
        Matcher m = p.matcher("!s");
        boolean b = m.matches();
        System.out.println(b);

        // 2-gi sposób
        boolean wynik = Pattern.compile(".s").matcher("!s").matches();
        System.out.println(wynik);

        // 3-ci sposób
        System.out.println(Pattern.matches(".A", "aA"));
        System.out.println(Pattern.matches("[a-zA-Z]{6}", "Aaaaaa"));
        System.out.println(Pattern.matches("[A-Z]*[a-z]*", "JArek"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]*", "a7A8a"));
        System.out.println(Pattern.matches("[A-Z][a-zA-Z0-9]*", "AaA7"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9!#$%&'*+/=?]+@[a-zA-Z0-9.-]+$", "ala@ma.kota"));

    }
}