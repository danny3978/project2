package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private static double total;
    static List<Double> arr = new ArrayList<>();


    Calculator(){

    }
/// 음.. 테스트
    public void calculate(double num1, double num2, OperatorType ch){

        ArithmeticCalculator<Double,Double,OperatorType> ai = new ArithmeticCalculator<>();
        ai.arithmeticCalculator(num1, num2, ch);
        System.out.println("결과: " + total);
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        Calculator.total = total;
    }

    public void removeResult(String remove){
        arr.add(getTotal());
        if(remove.equals("remove")){
            arr.remove(0);
        }

    }

    public void inquiryResults(String inquiry) {
        if(inquiry.equals("inquiry")){
            for(double all : arr){
                System.out.print(all + " ");
            }
        }
    }


}