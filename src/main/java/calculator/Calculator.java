package calculator;

public class Calculator {
    int total;

    public int calculate(int num1, int num2, char ch) throws ArithmeticException{



            if(ch == '+'){
                total = num1 + num2;
            } else if(ch == '-'){
                total = num1 - num2;
            } else if(ch == '*'){
                total = num1 * num2;
            } else if(ch == '/'){
                try{
                    total = num1 / num2;
                } catch (ArithmeticException er){
                    System.out.println("0으로 나눌 수 없습니다");
                }
            }
            return total;
    }

}
