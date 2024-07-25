package calculator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        Calculator cl = new Calculator();
        int answer = cl.calculate(sc.nextInt(), sc.nextInt(), sc.next().charAt(0));

        System.out.println(answer);
//        while(true){
//            System.out.print("첫 번째 숫자를 입력하세요: ");
//            int num1 = sc.nextInt();
//
//            System.out.print("두 번째 숫자를 입력하세요: ");
//            int num2 = sc.nextInt();
//
//            System.out.print("사칙연산 기호를 입력하세요: ");
//            char ch = sc.next().charAt(0);
//
//            int result = 0;
//
//            if (ch == '+') {
//                result = num1 + num2;
//            } else if (ch == '-') {
//                result = num1 - num2;
//            } else if (ch == '*') {
//                result = num1 * num2;
//            } else if (ch == '/') {
//                result = num1 / num2;
//            } else if (ch == '%') {
//                result = num1 % num2;
//            }
//
//
//            System.out.println("결과: " + result);
//
//            arr.add(result);
//
//            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
//            if(sc.next().equals("remove")){
//                arr.remove(0);
//            }
//
//            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
//            if(sc.next().equals("inquiry")){
//                for(int all : arr){
//                    System.out.print(all + " ");
//                }
//            }
//            System.out.println();
//            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//            if(sc.next().equals("exit")){
//                break;
//            }


//        }


    }
}
