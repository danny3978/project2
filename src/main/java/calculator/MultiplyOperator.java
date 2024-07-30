package calculator;

public class MultiplyOperator implements BinaryOperator<Double>{
    @Override
    public Double apply(Double t1, Double t2) {
        return t1 * t2;
    }
}
