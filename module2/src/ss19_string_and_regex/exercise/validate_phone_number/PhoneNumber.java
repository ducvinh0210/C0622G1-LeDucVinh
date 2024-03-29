package ss19_string_and_regex.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String PHONE_NUMBER_REGEX="[(][0-9]{2}[)][-][(][0][0-9]{9}[)]";

    public PhoneNumber(){}

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
