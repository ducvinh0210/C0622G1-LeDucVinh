package ss19_string_and_regex.exercise.validate_nameclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
private static Pattern pattern;
private Matcher matcher;
private static final String NAMECLASS_REGEX="^[APC][0-9]{4}[GHIKLM]$";
public NameClass(){
    pattern =Pattern.compile(NAMECLASS_REGEX);

}
public boolean validate(String regex){
    matcher= pattern.matcher(regex);
    return matcher.matches();
}
}
