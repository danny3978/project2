package calculator;

public class AddOperator implements BinaryOperator<Double> {
    @Override
    public Double apply(Double num1, Double num2) {
        return num1 + num2;
    }
}
