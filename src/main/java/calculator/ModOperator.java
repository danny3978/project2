package calculator;

public class ModOperator {
    private static int mod;
    public static int operate(int num1, int num2) {
        setMod(num1 % num2);
        return getMod();
    }

    public static int getMod() {
        return mod;
    }

    public static void setMod(int mod) {
        ModOperator.mod = mod;
    }
}
