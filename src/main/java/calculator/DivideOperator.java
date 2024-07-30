package calculator;

public class DivideOperator implements BinaryOperator<Double> {

    @Override
    public Double apply(Double num1, Double num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }
}
