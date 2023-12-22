package ch09.method.ex;

import java.util.Scanner;

public class MethodEx4MyAns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 0;


        while (true) {
            printMenu();
            int select = scanner.nextInt();

            if (select == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositMoney = scanner.nextInt();
                balance = deposit(balance, depositMoney);

                System.out.println(depositMoney + "원을 입금하였습니다. 현재 잔약: " + balance + "원");
            } else if (select == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawMoney = scanner.nextInt();
                if (withdrawMoney > balance) {
                    System.out.println(withdrawMoney + "원을 출금하려 했으나 잔액이 부족합니다.");
                } else {
                    balance = withdraw(balance, withdrawMoney);
                    System.out.println(withdrawMoney + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
                }

            } else if (select == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (select == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }


        }

    }


    public static void printMenu() {
        System.out.println("-------------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
        System.out.println("-------------------------------------");
        System.out.print("선택: ");
    }


    public static int deposit(int balance, int deposit) {
        return balance + deposit;
    }
    private static int withdraw(int balance, int withdrawMoney) {
        return balance - withdrawMoney;
    }

}
