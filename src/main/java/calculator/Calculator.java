package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private double total;
    List<Double> arr = new ArrayList<>();

    final double PI = 3.14;
    // 원주율은 변하지 않기 때문에 값이 변하지 않는 final을 씀
    private double o;


    Calculator(){

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


    public void calculateCircleArea(int ban) {
        setO(ban * ban * PI);
        System.out.println(this.o);
    }

    public double getO(){
        return o;
    }
    public void setO(double num1){
        this.o = num1;
    }


}
