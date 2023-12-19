package ch05.loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }

        System.out.println();
        for (int n = 2, cnt = 1; cnt <= 10; n+= 2, cnt++)
            System.out.println(n);


    }
}
