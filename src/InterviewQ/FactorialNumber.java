package InterviewQ;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int factorial =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = 5;
        for(int i = 1; i <=number; i++){
            factorial  = factorial * i;

        }
        System.out.println("Factorial of " + number + " is " + factorial);


    }
}
