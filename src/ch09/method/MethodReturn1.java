package ch09.method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = Odd(2);
        System.out.println(result);



    }

    public static boolean Odd(int i) {
        if(i % 2 == 1) {
            return true;
        }
        return false;
    }
}
