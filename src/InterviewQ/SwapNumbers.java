package InterviewQ;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");

        int a = 5;
        System.out.println("Enter the second number.");
        int b = 9;
        System.out.println("Before swapping: a = " + a + ", b =" + b);

        a = a + b;
        a = a - b;
        a = a / b;
        System.out.println("After swapping: a =" + a + ",b =" + b);


    }
}

// swap two numbers without using third variable.