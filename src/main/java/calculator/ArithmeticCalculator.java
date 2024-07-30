package calculator;


public class ArithmeticCalculator<T, U, E > extends Calculator{


    public void arithmeticCalculator (T num1, U num2, E type) {
        BinaryOperator<Double> operator = getOperator((OperatorType) type);
        setTotal(operator.apply((Double) num1 , (Double) num2));
    }


    private static BinaryOperator<Double> getOperator(OperatorType type){

        return switch (type){
            case Add -> new AddOperator();
            case Subs -> new SubstractOperator();
            case Mod -> new ModOperator();
            case Div -> new DivideOperator();
            case Mul -> new MultiplyOperator();
        };
    }

}


