package ch06.casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue); // longValue = 10

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue); // doubleValue = 10.0

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue); // doubleValue2 = 20.0
    }
}
