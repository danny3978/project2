package calculator;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("반지름으로 원의 넓이를 구하시겠습니까?");
            System.out.println("yes or no");

            if (sc.next().equals("yes")) {

                System.out.print("반지름을 입력하세요: ");
                CircleCalculator.calculateCircleArea(sc.nextInt());
                break;
            } else {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char ch = sc.next().charAt(0);

                try {
                    Calculator.calculate(num1, num2, ch);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    System.out.println("값이 0이 출력됩니다. 제거해주세요.");
                }



                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                Calculator.removeResult(sc.next());

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                Calculator.inquiryResults(sc.next());


                System.out.println();
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if (sc.next().equals("exit")) {
                    break;
                }
            }
        }
    }
}

