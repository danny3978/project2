package calculator;


public class ArithmeticCalculator extends Calculator{

    public void calculate(double num1, double num2, OperatorType type) {

        switch (type) {
            case Add ->
                setTotal(AddOperator.operate(num1, num2));

            case Subs ->
                setTotal(SubtractOperator.operate(num1, num2));

            case Mul ->
                setTotal(MultiplyOperator.operate(num1, num2));

            case Div ->
                setTotal(DivideOperator.operate(num1, num2));

            case Mod ->
                setTotal(ModOperator.operate(num1, num2));

        }


    }

}


