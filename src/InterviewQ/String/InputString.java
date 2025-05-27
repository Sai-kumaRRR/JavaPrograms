package InterviewQ.String;


// java program o gives output .
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String input = scanner.nextLine();

        String output = getCharacterCount(input);
        System.out.println("output" + output);

    }

    public static String getCharacterCount(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            //if the next character is the same, increase the count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                //Append the character and its count to te result
                result.append(str.charAt(i)).append(count);
            }
        }
        return result.toString();
    }
}
