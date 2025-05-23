package InterviewQ.Arrays;
// sort an array without using in-built method.
public class SortedArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 7, 9, 4};
        selectionSort(array);

        System.out.println("Sorted array");
        for (int num : array) {
            System.out.println(num + " ");

        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
        }
    }
}