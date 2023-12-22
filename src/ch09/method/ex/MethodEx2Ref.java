package ch09.method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, World";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
