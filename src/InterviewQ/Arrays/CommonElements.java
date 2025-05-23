//find common elements between two arrays


package InterviewQ.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[]array1 = {1 , 4 , 8 , 3 , 5};
        int[]array2 = {9 , 5 , 8 , 1 , 5};

        Set<Integer>commonElements = findCommonElements(array1,array2);

        System.out.println("Common elements"+ commonElements);
    }
    public static Set<Integer>findCommonElements(int[] array1,int[]array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        //add element of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }
        //check for common element in the second array
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;
    }

}
