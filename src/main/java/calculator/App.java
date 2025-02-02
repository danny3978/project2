package calculator;



import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cl = new Calculator();
        CircleCalculator ci = new CircleCalculator();


        while(true) {
            System.out.println("반지름으로 원의 넓이를 구하시겠습니까?");
            System.out.println("yes or no");

            if (sc.next().equals("yes")) {
                System.out.print("반지름을 입력하세요: ");
                ci.calculateCircleArea(sc.nextInt());
                System.out.println();
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if (sc.next().equals("exit")) {
                    break;
                }
            } else {
                try{
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char ch = sc.next().charAt(0);

                OperatorType type = getOperatorType(ch);

                if(type != null){
                    cl.calculate(num1, num2, type);
                } else{
                    System.out.println("연산 기호가 아닙니다.");
                    System.out.println();
                    continue;
                }



                }catch (InputMismatchException er){
                    System.out.println("숫자가 아닙니다.");
                    System.out.println();
                    continue;
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                    continue;
                }


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                cl.removeResult(sc.next());

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                cl.inquiryResults(sc.next());


                System.out.println();
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if (sc.next().equals("exit")) {
                    break;
                }
            }
        }
    }

    private static OperatorType getOperatorType(char ch) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getSymbol() == ch) {
                return type;
            }
        }
        return null;
    }
}

