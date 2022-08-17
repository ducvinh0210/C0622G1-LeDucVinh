package ss8_clean_code_and_refactoring.practince.split_variable;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        boolean coChiaHetCho3 = number % 3 == 0;
        boolean coChiaHetCho5 = number % 5 == 0;
        if (coChiaHetCho3 && coChiaHetCho5)
            return "FizzBuzz";

        if (coChiaHetCho3)
            return "Fizz";

        if (coChiaHetCho5)
            return "Buzz";

        return number + "";
    }
}
