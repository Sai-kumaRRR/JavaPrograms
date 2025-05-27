package InterviewQ.String;

// java program to gives output for the input string str.

import static InterviewQ.String.String01.rearrangeDigits;

public class String02 {
    public static void main(String[] args) {
        String input = "3241578699";
        String formattedoutput = String.format("0111d", Long.parseLong(input));
        System.out.println("format output " + formattedoutput);

    }
}
