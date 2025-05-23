package InterviewQ.Arrays;

// array duplicates from an array.
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 8, 4, 2};
        int[] uniqueArray = removeDuplicate(array);

        System.out.println("Array with duplicate removed");

        for (int num : uniqueArray) {
            System.out.println(num + " ");

        }
    }


    public static int[] removeDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int num : array){
        set.add(num);

    }

    int[] result = new int[set.size()];
    int i = 0;

    for (int num : set){


        result[i++] = num;


    }
    return result;
}
}
