package ss19_string_and_regex.exercise.validate_nameclass;

import javax.xml.soap.Name;

public class NameCLassTest {
    private static NameClass nameClass;
    public static final String[] valiNameClass = new String[]{"C0622G"};
    public static final String[] invaliNameClass = new String[]{"5633535"};

    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String nameClass1 : valiNameClass) {
            boolean isvalid = nameClass.validate(nameClass1);
            System.out.println("Nameclass " + nameClass1 + "is valid" + isvalid);
        }
        for (String nameClass2 : invaliNameClass) {
            boolean isvalid= nameClass.validate(nameClass2);
            System.out.println("Nameclass"+ nameClass2+ "is valid"+ isvalid);

        }
    }
}
