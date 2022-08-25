package ss19_string_and_regex.exercise.validate_phone_number;

public class PhoneNumberTest {
    private static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    private static final String[] invalidPhoneNumber = new String[]{"(ss)-(7476474646)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String number : validPhoneNumber) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("Phone Number" + number + " is valid: " + isValid);
        }
        for (String number : invalidPhoneNumber) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("Phone Number" + number + " is valid: " + isValid);

        }
    }
}

