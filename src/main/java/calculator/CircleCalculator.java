package calculator;

public class CircleCalculator extends Calculator{
    final double PI = 3.14;
    // 원주율은 변하지 않기 때문에 값이 변하지 않는 final을 씀
    private double o;

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
