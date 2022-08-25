package ss19_string_and_regex.practince.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String ACCOUNT_REGEX = "[_a-z0-9]{6,}";
    public AccountExample(){
        pattern = Pattern.compile(ACCOUNT_REGEX);


    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
