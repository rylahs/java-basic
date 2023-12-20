package ch07.scanner;

import java.io.IOException;
import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("말을 따라하는 프로그램입니다.");
            System.out.print("문자열을 입력해주세요(exit는 종료입니다.):");
            String str = scanner.nextLine();


            if (str.equals("exit"))
                break;
            else
                System.out.println(str);
        }

        System.out.println("프로그램을 종료합니다.");

        scanner.close();
    }
}
