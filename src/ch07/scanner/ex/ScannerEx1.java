package ch07.scanner.ex;


// 이름 나이 입력받고 출력하기
// 사용자로부터 입력 받은 이름과 나이를 출력하세요
// 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [살]입니다." 이어야 합니다.

// 실행 결과 예시
// 당신의 이름을 입력하세요:자바
// 당신의 나이를 입력하세요:30
// 당신의 이름은 자바이고, 나이는 30살 입니다.

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요:");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");

        scanner.close();


    }
}
