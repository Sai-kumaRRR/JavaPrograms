package InterviewQ.Arrays;

// java program to count  odd and even number from  given array.
public class Main {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] count = countoddandEven(array);

        System.out.println("Even numbers count:" + count[1]);
        System.out.println("odd numbers count:" + count[0]);


    }

    public static int[] countoddandEven(int[] array) {
        int[] count = new int[2]; // index 0 for odd count, index 1 for even count

        for (int num : array) {
            if (num % 2 == 0) {
                count[1]++; // increment odd count

            }
        }
        return count;
    }
}