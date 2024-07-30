package calculator;

public class ModOperator implements BinaryOperator<Double>{
    @Override
    public Double apply(Double num1, Double num2) throws ArithmeticException{
        return num1 % num2;
    }
}
