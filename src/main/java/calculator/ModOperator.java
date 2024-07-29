package calculator;

public class ModOperator {
    private static int mod;
    public static int operate(double num1, double num2) {
        setMod((int) (num1 % num2));
        return getMod();
    }

    public static int getMod() {
        return mod;
    }

    public static void setMod(int mod) {
        ModOperator.mod = mod;
    }
}
