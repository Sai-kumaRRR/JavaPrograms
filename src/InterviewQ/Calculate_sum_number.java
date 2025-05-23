package InterviewQ;

public class Calculate_sum_number {
    public static void main(String[] args) {
        int number = 12345;

        int sumofDigits = calculateSumofDigits(number);
        System.out.println("Sum of digits of" + number + "is:" + sumofDigits);

    }

    public static int calculateSumofDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // extract the last digit
            sum = sum + digit; // Add digit to sum
            number = number / 10; // remove the last digit from number
        }
        return sum;
    }
}
// Calculate the sum digit of a number.