public class Operations {
    public double add(double a, double b) {
        return a+b;
    }

    public byte addByteNumbers(byte a, byte b) {
        int result = a + b;
        if(result>128||result<127)throw new ArithmeticException("Out of byte");
        return (byte) result;
    }

    public double sub(double a, double b) {
        return a-b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public double div(double a, double b) {
        if (b!=0){
            return a/b;
        } else throw new ArithmeticException("Este imposibila impartirea la 0");
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public boolean isOdd(int number){
        return number % 2 == 1;
    }
}
