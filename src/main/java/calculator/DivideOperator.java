package calculator;

public class DivideOperator implements BinaryOperator<Double> {
    @Override
    public Double apply(Double t1, Double t2) throws ArithmeticException{
        if(t2 == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return t1 / t2;
    }
}
