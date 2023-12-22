package ch08.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;
        System.out.print("입력 받을 숫자의 갯수를 입력하세요 : ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println(count+ "개의 정수를 입력하세요");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        System.out.println("출력");
        System.out.println("합계 " + sum);
        System.out.println("평균 " + average);



    }
}
