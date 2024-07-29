package calculator;

import static calculator.OperatorType.*;

public class ArithmeticCalculator<T, U, E>{
    private Calculator cl = new Calculator();

    public void calculate(T t, U u, E e) {

        switch ((OperatorType) e){
            case Add:
                cl.setTotal(AddOperator.operate((double)t, (double)u));
                break;
            case Subs:
                cl.setTotal(SubtractOperator.operate((double)t, (double)u));
                break;
            case Mul:
                cl.setTotal(MultiplyOperator.operate((double)t, (double)u));
                break;
            case Div:
                cl.setTotal(DivideOperator.operate((double)t, (double)u));
                break;
            case Mod:
                cl.setTotal(ModOperator.operate((double)t, (double)u));
                break;
        }


    }

}


