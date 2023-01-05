
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static List<String> password(String[] passwords, String checkString) {
        List<String> validPasswords = new ArrayList<>();
        // Convert list to ArrayList
        List<String> inputList = new ArrayList<>();
        Collections.addAll(inputList, passwords);
        //Extract the check String
        int numberOfUppercase = Integer.parseInt(checkString.substring(0, 1));
        String inputString = checkString.substring(1, 4);
        int sumOfDigits = Integer.parseInt(checkString.substring(checkString.length() - 1));

        //Reverse the 3 middle character
        char[] characters = inputString.toCharArray();
        String reverse = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            reverse = reverse + characters[i];
        }
        for (String password : inputList) {
            boolean flag = true;
            // 1- Check uppercase character
            int countOfUppercase = numberOfUppercaseCharacter(password);
            if (countOfUppercase != numberOfUppercase) {
                flag = false;
                continue;
            }
            // 2- Check String existence
            if (!stringExistence(password, reverse)) {
                flag = false;
                continue;
            }
            // 3- Check sum of all digits
            int sum = findIntegers(password);
            if (sum != sumOfDigits) {
                flag = false;
                continue;
            }
            // check all
            if (flag) {
                validPasswords.add(password);
            }
        }

        return validPasswords;
    }

    public static int numberOfUppercaseCharacter(String inputStr) {
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isUpperCase(inputStr.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean stringExistence(String inputStr, String existenceStr) {
        return inputStr.contains(existenceStr);
    }

    public static int findIntegers(String stringToSearchDigits) {
        Pattern integerPattern = Pattern.compile("-?\\d+");
        Matcher matcher = integerPattern.matcher(stringToSearchDigits);
        String numbers = "";
        int sum = 0;
        while (matcher.find()) {
            numbers += matcher.group();
        }
        char[] chars = numbers.toCharArray();
        for (char ch : chars) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test 1
        String[] input = {"P@ssWORD1", "20passWORD20", "PASS6word"};
        String checkString = "4dro6";
        // Test 2
//        String[] input = {"theBestpassword", "myPassword#3"};
//        String checkString = "1dro0";
        // Test 3
//        String[] input = {"MyPassword2", "crazyPassword1#$%"};
//        String checkString = "1%$#1";
        // Test 4
//        String[] input = {"luckyPASSWORD#$$$", "luckyDay666"};
//        String checkString = "6pass7";

        List<String> passwordList = password(input, checkString);
        System.out.println("The valid passwords are: ");
        for (String str : passwordList) {
            System.out.print(str + " , ");
        }
    }

}
