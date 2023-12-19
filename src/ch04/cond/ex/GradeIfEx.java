package ch04.cond.ex;

// 문제: 학점에 따른 성취도 출력하기
// String grade라는 문자열을 만들고 학점에 따라 성취도를 출력하는 프로그램을 작성하자.
// 각 학점은 다음과 같은 성취도를 나타낸다.

// "A": "탁월한 성과입니다!"
// "B": "좋은 성과입니다!"
// "C": "준수한 성과입니다!"
// "D": "향상이 필요합니다."
// "F": "불합격입니다."
// 나머지: "잘못된 학점입니다."

public class GradeIfEx {
    public static void main(String[] args) {
        String grade = "A";
        if (grade.equals("A"))
            System.out.println("\"탁월한 성과입니다!\"");
        else if (grade.equals("B"))
            System.out.println("\"좋은 성과입니다!\"");
        else if (grade.equals("C"))
            System.out.println("\"준수한 성과입니다!\"");
        else if (grade.equals("D"))
            System.out.println("\"향상이 필요합니다.\"");
        else if (grade.equals("F"))
            System.out.println("\"불합격입니다.\"");
        else
            System.out.println("\"잘못된 학점입니다.\"");
    }
}
