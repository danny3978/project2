    package calculator;

    public enum OperatorType {
        Add('+'),
        Subs('-'),
        Div('/'),
        Mul('*'),
        Mod('%');

        private final char symbol;

        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }
