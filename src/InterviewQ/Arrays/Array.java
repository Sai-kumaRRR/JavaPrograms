package InterviewQ.Arrays;

// find the largest and smallest element in an array

public class Array {
    public static void main(String[] args) {


        int[] Array = {3, 4, 6, 8, 2, 9};
        int[] result = findLargestAndSmallest(Array);
        System.out.println("Smallest element" + result[0]);
        System.out.println("Largest element" + result[1]);


    }

    public static int[] findLargestAndSmallest(int[] Array) {

        if (Array == null || Array.length == 0) {
            throw new IllegalArgumentException("array must not be null or empty");


        }
        int smallest = Array[0];
        int largest = Array[0];
        for (int num : Array) {
            if (num < smallest) {

            }
            if (num > largest) {
                largest = num;
            }
        }
        return new int[]{smallest};
    }
}