package InterviewQ.Arrays;


public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // number of positions to rotate

        int n = arr.length;
        k = k % n;
        // In case k is greater than array length

        //rotate the array
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        //output rotated array
        System.out.println("Rotated Array");

        for (int i : arr) {
            System.out.println(i + "");
        }
    }

    // Method to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}