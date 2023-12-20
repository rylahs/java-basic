package ch07.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;
        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("상품명을 입력하세요: ");
                    String productName = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int productPrice = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    int productQuantity = scanner.nextInt();

                    int thisTimePrice = productPrice * productQuantity;

                    System.out.println("상품명: " + productName + " 가격: " + productPrice + " 수량: " + productQuantity
                            + " 합계: " + thisTimePrice);
                    totalPrice += thisTimePrice;
                }
                case 2 -> {
                    System.out.println("총 비용: " + totalPrice);
                    totalPrice = 0;
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}