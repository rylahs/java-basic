package ch09.method.ex;

// 리팩토링
public class MethodeEx1RefMyAns {
    public static void main(String[] args) {
        int sum = add(1, 2, 3);
        double average = average(sum, 3);
        printAverage(average);

        sum = add(15, 25, 35);
        average = average(sum, 3);
        printAverage(average);
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double average(int sum, int n) {
        return (double)sum / n;
    }
    public static void printAverage(double average) {
        System.out.println("평균값: " + average);
    }
}
