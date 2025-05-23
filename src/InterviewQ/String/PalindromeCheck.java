package InterviewQ.String;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");

        String str = sc.nextLine();

        String reversed = " ";

        for(int i = str.length() - 1; i>= 0; i--) {
            reversed += str.charAt(i);

        }
        if (str.equalsIgnoreCase(reversed))
        {
            System.out.println(str +"is a Palindrome");
        }else{
            System.out.println(str +" is Not a  Palindrome");

        }
    }
}
