package InterviewQ;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();


        if(isPalindrome(number)){
            System.out.println(number +"is a Palindrome.");
        }else{
            System.out.println(number + "is not a palindrome ");
        }
    }
    public static boolean isPalindrome(int num){
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0){
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num/10;
        }
        return originalNumber == reversedNumber;

    }

}
