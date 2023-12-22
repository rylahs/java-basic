package ch08.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_PRODUCT_CNT = 10;

        int menu, productCount = 0;
        String[] productNames = new String[MAX_PRODUCT_CNT];
        int[] productPrices = new int[MAX_PRODUCT_CNT];

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount >= MAX_PRODUCT_CNT) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품의 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;

            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }

            } else if (menu == 3)
                break;
            else {
                System.out.println("잘못 입력되었습니다.");

            }
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
