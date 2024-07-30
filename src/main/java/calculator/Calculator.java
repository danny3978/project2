package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
     private static double total;
     static List<Double> arr = new ArrayList<>();


    Calculator(){

    }

    public void calculate(double ignoredNum1, double ignoredNum2, OperatorType ignoredCh){

        ArithmeticCalculator<Double,Double,OperatorType> ai = new ArithmeticCalculator<>();
        ai.arithmeticCalculator(ignoredNum1, ignoredNum2, ignoredCh);
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
