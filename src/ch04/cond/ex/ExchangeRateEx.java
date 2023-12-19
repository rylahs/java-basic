package ch04.cond.ex;

// 문제: 환율 계산하기
// 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 자것ㅇ하자 환율은 1달러당 1300원이라고 가정합니다.
// 다음과 같은 기준을 따른다

// 달러가 0 미만이면: "잘못된 금액입니다."
// 달러가 0일 때: "환전할 금액이 없습니다."
// 달러가 0 초과일 때 : "환전 금액은 (계산된 원화 금액)원입니다."

// 출력 예시
// dollar: -5
// 출력: 잘못된 금액입니다.


public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar;
        int wonRate = 1300;

        dollar = -5;
        ExchangeDollar(dollar, wonRate);
        dollar = 0;
        ExchangeDollar(dollar, wonRate);
        dollar = 10;
        ExchangeDollar(dollar, wonRate);
    }
    static void ExchangeDollar(int dollar, int wonRate)
    {
        if (dollar < 0)
        {
            System.out.println("잘못된 금액입니다.");
            return;
        }
        else if (dollar == 0)
        {
            System.out.println("환전할 금액이 없습니다.");
            return;
        }
        else
        {
            System.out.println("환전 금액은 " + dollar * wonRate + "원 입니다.");
            return;
        }

    }
}
