package ch05.loop.ex;


// 문제 :자연수 출력
// 처음 10 개의 자연수를 출력하는 프로그램을 작성해보세요.
// 이 때, count라는 변수를 사용해야됩니다.
// while문, for문 2가지 버전의 정답을 만들어야 합니다.
public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 10)
        {
            System.out.println(count++);
        }
    }
}
