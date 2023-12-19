package ch04.cond;

// 문제
// 당신은 연령에 따라 다른 메시지를 출력하는 프로그램을 작성해야 한다.
// 이 프로그램은 int age라는 변수를 사용해야 하며, 연령에 따라 다음을 출력해야한다.

// - 7세 이하인 경우: "미취학"
// - 8세 이상 13세 이하인 경우 : "초등학생"
// - 14세 이상 16세 이하인 경우 : "중학생"
// - 17세 이상 19세 이하인 경우 : "고등학생"
// - 20세 이상인 경우 : "성인"

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) // 미취학
            System.out.println("미취학");

        if (age >= 8 && age <= 13)
            System.out.println("초등학생");

        if (age >= 14 && age <= 16)
            System.out.println("중학생");

        if (age >= 17 && age <= 19)
            System.out.println("고등학생");

        if (age >= 20)
            System.out.println("성인");
    }
}
