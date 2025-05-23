package InterviewQ;

import java.util.Scanner;

public class PrimeNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of term.");
        int number = 6;
        int first = 0, second = 1, next;
        System.out.println("Fibonacci series is");
        for (int i = 0; i <= number; i++) {
            System.out.println(first + "");
            next = second;
            second = next;
        }
    }
}

// find fibonacci series up to a given number range.