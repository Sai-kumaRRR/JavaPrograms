package InterviewQ.String;

//Java program to swap two string without using 3rd variable.
import java.util.Scanner;

public class WithOut3thVariables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("enter second string:");
        String str2 = scanner.nextLine();

        System.out.println("Before swapping str1 =" + str1 + ", " + str2);

        //swapping without using a third variables
        str1 = str1 + str2; // concatenate str1 and str2 and store in str1

        str2 = str1.substring(0, str1.length() - str2.length());
        //extract the initial part original str1 from thevconcateed string
        str1 = str1.substring(str2.length());
        // extract the remaining part original part original str2

        System.out.println("After swapping str1" + str1 + str2);
    }
}
