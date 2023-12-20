package ch07.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요(0을 입력하면 종료): ");
            int number = scanner.nextInt();

            if (number == 0)
                break;

            sum += number;

        }
        System.out.println("입력한 정수의 총 합은 " + sum + "입니다.");
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
