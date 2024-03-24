package org.example;

public class PrimitiveTypes {
    /**
     * Wartości domyślne
     * byte =  0            - 1 bajt = od -128 do 127 (jest wliczane '0')
     * short = 0            - 2 bajty = -32768 do 32767 (jest wliczane '0')
     * int = 0              - 4 bajty = -2147483648 do 2147483647 (jest wliczane '0')
     * long = 0L            - 8 bajtów = -9223372036854775808 do 9223372036854775807 (jest wliczane '0')
     * float = 0.0f         - 4 baty 6-7 cyfr po przecinku
     * double = 0.0d        - 8 bajtów 15 cyfr po przecinku.
     * char = '\u0000'
     * boolean = false
     */
    public static byte exampleByte; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static short exampleShort; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static int exampleInt; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static long exampleLong; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static float exampleFloat; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static double exampleDouble; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static char exampleChar; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static boolean exampleBoolean; // zmienna globalna, po za ciałem metody, mają domyślnie przydzielane wartości
    public static void main(String[] args) {
        // liczby całkowite
        byte variableByte = 127; // zmienna lokalna, musi mieć przypisaną wartości przed użyciem
        System.out.println("Locale byte: " + variableByte);
        System.out.println("Global byte: " + exampleByte);
        System.out.println("Byte: " + Byte.MIN_VALUE + " 0 " + Byte.MAX_VALUE);

        short variableShort = 32767; // zmienna lokalna, musi mieć przypisaną wartości przed użyciem
        System.out.println("Locale short: " + variableShort);
        System.out.println("Global short: " + exampleShort);
        System.out.println("Short: " + Short.MIN_VALUE + " 0 " + Short.MAX_VALUE);

        int variableInt = 32767; // zmienna lokalna, musi mieć przypisaną wartości przed użyciem
        System.out.println("Locale int: " + variableInt);
        System.out.println("Global int: " + exampleInt);
        System.out.println("Integer: " + Integer.MIN_VALUE + " 0 " + Integer.MAX_VALUE);

        // w JAVA domyślna wartość całkowita jest typu Integer (int)
        long variableLong = 9223372036854775807L; // zmienna lokalna, musi mieć przypisaną wartości przed użyciem
        System.out.println("Locale long: " + variableLong);
        System.out.println("Global long: " + exampleLong);
        System.out.println("Long: " + Long.MIN_VALUE + " 0 " + Long.MAX_VALUE);

        // liczby zmiennoprzecinkowe
        // domyślne liczby zmiennoprzecinkowe są typu 'double'
        float variableFloat = 3.14123411111F; // zmienna lokalna, musi mieć przypisaną wartości przed użyciem
        System.out.println("Locale float: " + variableFloat);
        System.out.println("Global float: " + exampleFloat);
        System.out.println("Float: " + Float.MIN_VALUE + " 0 " + Float.MAX_VALUE);

        double variableDouble = 3.141234123345653D; // zmienna lokalna, musi mieć przypisaną wartości przed użyciem
        System.out.println("Locale double: " + variableDouble);
        System.out.println("Global double: " + exampleDouble);
        System.out.println("Double: " + Double.MIN_VALUE + " 0 " + Double.MAX_VALUE);

        // Pojedyńcze znaki
        char variableChar = 'a';
        char variableCharV2 = '\u0105';
        System.out.println("Locale Char: \u1059 " + variableChar);
        System.out.println("Locale Char: " + variableCharV2);
        System.out.println("Global Char: " + exampleChar);
        System.out.println("Character: " + Character.MIN_VALUE + " 0 " + Character.MAX_VALUE);

        // wartości logiczne
        boolean variableBoolean = true;
        System.out.println("Locale Boolean: " + variableBoolean);
        System.out.println("Global Boolean: " + exampleBoolean);
        System.out.println("Global Boolean: " + Boolean.FALSE);
    }
}