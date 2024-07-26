package calculator;

import java.util.InputMismatchException;

public class ArithmeticCalculator extends Calculator{
    public static void calculate(int num1, int num2, char ch) throws ArithmeticException {

        switch (ch) {
            case '+':
                setTotal(AddOperator.operate(num1, num2));
                break;
            case '-':
                setTotal(SubtractOperator.operate(num1, num2));
                break;
            case '*':
                setTotal(MultiplyOperator.operate(num1, num2));
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                setTotal(DivideOperator.operate(num1, num2));
                break;
            case '%':
                setTotal(ModOperator.operate(num1, num2));
                break;
            default:
                System.out.println("연산 기호가 아닙니다.");
                System.out.println();

        }

    }
}


