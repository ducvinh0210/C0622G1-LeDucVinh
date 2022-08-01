package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class ChangeNumberToLetters {
    public static void main(String[] args) {
            String[] numbersUnits = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] numbersTens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int isHundred = 0;
            String[] numString = Integer.toString(number).split("", 0);
            if (numString.length == 3){
                isHundred = 1;
                System.out.print(numbersUnits[Integer.parseInt(numString[0])] + " hundred ");
                number -= Integer.parseInt(numString[0]) * 100;
                if (number != 0){
                    System.out.print("and ");
                }
            }
            if (number != 0) {
                if (number < 20) {
                    System.out.print(numbersUnits[number]);
                } else {
                    System.out.print(numbersTens[Integer.parseInt(numString[0+isHundred]) - 2] + ' ' + numbersUnits[Integer.parseInt(numString[1+isHundred])]);
                }
            }
        }
    }





