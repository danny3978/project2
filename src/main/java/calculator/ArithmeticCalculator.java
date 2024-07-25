package calculator;

public class ArithmeticCalculator extends Calculator{
    public void calculate(int num1, int num2, char ch) throws ArithmeticException{

        switch (ch){
            case '+' :
                setTotal(num1 + num2);
                break;
            case '-':
                setTotal(num1 - num2);
                break;
            case '*':
                setTotal(num1 * num2);
                break;
            case '/':
                if(num2 == 0){
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                setTotal((double) num1 / num2);
                break;
        }

    }
}
