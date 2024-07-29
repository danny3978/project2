package calculator;


public class ArithmeticCalculator extends Calculator{

    public void calculate(int num1, int num2, OperatorType type) {

        switch (type){
            case Add :
                setTotal(AddOperator.operate(num1, num2));
                break;
            case Subs:
                setTotal(SubtractOperator.operate(num1,num2));
                break;
            case Mul:
                setTotal(MultiplyOperator.operate(num1,num2));
                break;
            case Div:
                setTotal(DivideOperator.operate(num1,num2));
                break;
            case Mod:
                setTotal(ModOperator.operate(num1,num2));
                break;
        }


    }

}


