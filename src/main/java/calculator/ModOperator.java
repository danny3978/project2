package calculator;

public class ModOperator {
    private static int mod;
    public static int operate(int num1, int num2) {
        mod = num1 % num2;
        return mod;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        ModOperator.mod = mod;
    }
}
