package InterviewQ.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 78, 22};
        int max = numbers[0];// Assume first element is max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
        }
        System.out.println("The largest number is" + max);
    }
}

// find the largest number in an  Array.