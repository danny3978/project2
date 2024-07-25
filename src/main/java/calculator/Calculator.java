package calculator;

public class Calculator {
    double total;

    public double calculate(int num1, int num2, char ch) throws ArithmeticException{



            if(ch == '+'){
                total = num1 + num2;
            } else if(ch == '-'){
                total = num1 - num2;
            } else if(ch == '*'){
                total = num1 * num2;
            } else if(ch == '/'){
                try{
                    total = (double) num1 / num2;
                } catch (ArithmeticException er){
                    System.out.println("0으로 나눌 수 없습니다");
                    System.out.println("0이 출력됩니다. 제거해주세요");
                }
            }
            return total;
    }

}
