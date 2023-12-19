package ch05.loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;
        sum = sum + i; // sum(0) + 1 -> sum(1)
        System.out.println("i=" + i + " sum = " + sum);
        i++;

        sum = sum + i; // sum(1) + 2 -> sum(3)
        System.out.println("i=" + i + " sum = " + sum);
        i++;

        sum = sum + i; // sum(3) + 3 -> sum(6)
        System.out.println("i=" + i + " sum = " + sum);
    }
}
