package ss8_clean_code_and_refactoring.practince.renaming_variable_constant_separation;

public class Calculator {
    public static final char ADDITION= '+';
    public static final char SUBTRACTION='-';
    public static final char MULTIPLICATION='*';
    public static final char DiVISION='/';
    public static int calculate(int firstOperand, int secondOperand, char operand) {
        switch (operand) {

            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DiVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
