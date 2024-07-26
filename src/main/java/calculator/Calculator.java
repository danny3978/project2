package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
     private static double total;
     static List<Double> arr = new ArrayList<>();


    Calculator(){

    }

    public static void calculate(int num1, int num2, char ch){

        ArithmeticCalculator.calculate(num1, num2, ch);
        System.out.println("결과: " + total);
    }

    public static double getTotal(){
        return total;
    }

    public static void setTotal(double total){
        Calculator.total = total;
    }

    public static void removeResult(String remove){
        arr.add(getTotal());
        if(remove.equals("remove")){
            arr.remove(0);
        }

    }

    public static void inquiryResults(String inquiry) {
        if(inquiry.equals("inquiry")){
            for(double all : arr){
                System.out.print(all + " ");
            }
        }
    }


}
