package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private double total;
    List<Double> arr = new ArrayList<>();

    Calculator(){
        this.arr.clear();
    }

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
            System.out.println("결과: " + total);

    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public void removeResult(String remove){
        this.arr.add(getTotal());
        if(remove.equals("remove")){
            arr.remove(0);
        }

    }

    public void inquiryResults(String inquiry) {
        if(inquiry.equals("inquiry")){
            for(double all : this.arr){
                System.out.print(all + " ");
            }
        }


    }
}
