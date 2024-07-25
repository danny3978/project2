package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    int total;

    public int calculate(int num1, int num2, char ch) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        while(true) {


            int result = 0;


            if (ch == '+') {
                total = num1 + num2;
            } else if (ch == '-') {
                total = num1 - num2;
            } else if (ch == '*') {
                total = num1 * num2;
            } else if (ch == '/') {
                try {
                    total = num1 / num2;
                } catch (ArithmeticException er) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    System.out.println("0이 출력됩니다.");
                }

            }


            System.out.println("결과: " + result);

            arr.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.next().equals("remove")) {
                arr.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                for (int all : arr) {
                    System.out.print(all + " ");
                }
            }
            System.out.println();
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")) {
                break;
            }
            return total;

        }
         return total;

    }

}


