package ch09.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;
            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);

                    System.out.println(amount + "원을 입금하였습니다. 현재 잔약: " + balance + "원");
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    if (amount > balance) {
                        System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
                    } else {
                        balance = withdraw(balance, amount);
                        System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
                    break;
            }
        }

    }
    public static int deposit(int balance, int deposit) {
        return balance + deposit;
    }
    private static int withdraw(int balance, int withdrawMoney) {
        return balance - withdrawMoney;
    }

}
