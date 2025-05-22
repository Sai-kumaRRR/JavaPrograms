package InterviewQ;

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + "is not a prime number");
            return;
        }
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;

                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "is a Prime number");
        } else {
            System.out.println(num + "is not a prime number");


        }
    }
}