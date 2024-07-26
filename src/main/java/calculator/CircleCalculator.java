package calculator;

public class CircleCalculator extends Calculator{
    static final double PI = 3.14;
    // 원주율은 변하지 않기 때문에 값이 변하지 않는 final을 씀
    private static double o;

    public static void calculateCircleArea(int ban) {
         setO(ban * ban * PI);
        System.out.println(o);
    }

    public static double geto(){
        return o;
    }

    public static void setO(double num){
        CircleCalculator.o = num;
    }
}
