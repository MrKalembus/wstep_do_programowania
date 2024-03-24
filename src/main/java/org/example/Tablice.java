package org.example;

public class Tablice {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "world"}; // tablica 2 elementowa
        String[] stringArray2 = new String[]{"Hello", "world"}; // tablica 2 elementowa
        int[] intArray = new int[5]; // 0,0,0,0,0
        intArray[0] = 10;            // 10,0,0,0,0
        intArray[3] = 8;            // 10,0,0,8,0
        int[] intArray2 = new int[]{1, 2, 3, 4, 5}; // 1,2,3,4,5
        // index   0     1    2      3
        String[] stringArray3 = new String[4]; // null, null, null, null
        for (String name : stringArray3) {
            System.out.println(name);
        }

        stringArray3[0] = "Jan";
        stringArray3[3] = "Karol";

        for (String name : stringArray3) {
            System.out.println(name);
        }

        for (int i = 0; i < stringArray3.length; i++) {
            System.out.println("Element : " + (i + 1) + " o indexie: " + i + " " + stringArray3[i]);
        }

        String[][] myArray = new String[2][4];
        myArray[0] = new String[]{"Ala", "Ma", "Kota", "Janka"};
        myArray[1] = new String[]{"A", "kot", "ma", "Ale"};

        System.out.println(myArray[0][0]);
        System.out.println(myArray[0][1]);
        System.out.println(myArray[0][2]);
        System.out.println(myArray[0][3]);
        System.out.println(myArray[1][1]);

        myArray = new String[2][];
        myArray[0] = new String[]{"Ala", "Ma", "Kota", "Janka"};
        myArray[1] = new String[]{"A", "kuku"};

        System.out.println(myArray[0][0]);
        System.out.println(myArray[0][1]);
        System.out.println(myArray[0][2]);
        System.out.println(myArray[0][3]);
        System.out.println(myArray[1][0]);
        System.out.println(myArray[1][1]);
        System.out.println(myArray[1][2]);
    }
}