package calculator;

public class ArithmeticCalculator extends Calculator{
    public void calculate(int num1, int num2, char ch) throws ArithmeticException{

        switch (ch){
            case '+' :
                AddOperator addOperator = new AddOperator();
                setTotal(addOperator.operate(num1,num2));
            case '-':
                SubtractOperator subtractOperator = new SubtractOperator();
                setTotal(subtractOperator.operate(num1,num2));
                break;
            case '*':
                MultiplyOperator multiplyOperator = new MultiplyOperator();
                setTotal(multiplyOperator.operate(num1,num2));
                break;
            case '/':
                DivideOperator divideOperator = new DivideOperator();
                if(num2 == 0){
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                setTotal(divideOperator.operate(num1,num2));
                break;
            case '%':
                ModOperator modOperator = new ModOperator();
                setTotal(modOperator.operate(num1,num2));
        }

    }
}


