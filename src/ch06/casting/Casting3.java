package ch06.casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // intMax
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int)maxIntValue;
        System.out.println("maxIntValue Casting= " + intValue);

        intValue = (int)maxIntOver;
        System.out.println("maxIntValue Casting= " + intValue);

    }
}
