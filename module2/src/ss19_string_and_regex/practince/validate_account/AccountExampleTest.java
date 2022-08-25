package ss19_string_and_regex.practince.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] valiAccount = new String[]{"123___", "123abc", "123456", "abcdef"};
    public static final String[] invaliAccount = new String[]{".@", "Ahdhdg", "sdsdsdsd", "3jdh"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : valiAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is   " + account + "," + " is valid  " + isvalid);

        }
        for (String account : invaliAccount) {

            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is      " + account + "," + "  is valid   " + isvalid);
        }


    }
}
