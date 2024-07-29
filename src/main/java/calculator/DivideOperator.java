package calculator;

public class DivideOperator {
    public static double operate(double num1, double num2) throws ArithmeticException {
        if(num2 == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }
}
