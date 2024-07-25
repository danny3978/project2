package calculator;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private double total;

    public double calculate(int num1, int num2, char ch) throws ArithmeticException{



            switch (ch){
                case '+' :
                   total = num1 + num2;
                    break;
                case '-':
                    total = num1 - num2;
                    break;
                case '*':
                    total = num1 * num2;
                    break;
                case '/':
                    if(num2 == 0){
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    total = (double) num1 / num2;
                    break;
            }
            System.out.println("결과: " + total);
            return total;

    }

    public double getTotal(){
        return total;
    }

    public double setTotal(double total){
        this.total = total;
        return this.total;
    }

    public void removeResult(String remove){
        List<Double> arr = new ArrayList<>();
        arr.add(total);
        if(remove.equals("remove")){
            arr.remove(0);
        }

    }
}
