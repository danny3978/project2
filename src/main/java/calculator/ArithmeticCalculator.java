package calculator;


import static calculator.OperatorType.*;

public class ArithmeticCalculator<T, U ,E> extends Calculator{

    public void arithmeticCalculator (T num1, U num2, E type) {

        if (type.equals(Add)) {
            setTotal(AddOperator.operate((double) num1, (double) num2));
        } else if (type.equals(Subs)) {
            setTotal(SubtractOperator.operate((double) num1, (double) num2));
        } else if (type.equals(Mul)) {
            setTotal(MultiplyOperator.operate((double) num1, (double) num2));
        } else if (type.equals(Div)) {
            setTotal(DivideOperator.operate((double) num1, (double) num2));
        } else if (type.equals(Mod)) {
            setTotal(ModOperator.operate((double) num1, (double) num2));
        }


    }

}


