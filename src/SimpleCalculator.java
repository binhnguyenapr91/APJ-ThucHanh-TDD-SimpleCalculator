public class SimpleCalculator {
    public static int add(int firstOperand, int secondOperand){
        if (firstOperand / 2 + secondOperand / 2 >= Integer.MAX_VALUE / 2) {
            throw new RuntimeException("out of range exception");
        }
        if (firstOperand / 2 + secondOperand / 2 <= Integer.MIN_VALUE / 2) {
            throw new RuntimeException("out of range exception");
        }
        return firstOperand + secondOperand;
    }
}
