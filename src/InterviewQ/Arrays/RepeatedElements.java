package InterviewQ.Arrays;

//Java program - Input array was i

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedElements {
    public static void main(String[] args) {
        int[]array = {1 , 1 , 2 , 2 , 2 , 3 , 4 , 5 , 5 , 66 , 6};
        List<Integer>result = findnonReatedelement(array);
        System.out.println("Non Reatedelement:" + result);

    }
    public static List<Integer>findnonReatedelement(int[]array) {
        //step 1: count occurrences of each element using a Hashmap
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        }
        //Step2.) Identify elements with count equals to 1(non- repeated)
        List<Integer> nonRepeatedElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatedElements.add(entry.getKey());
            }
        }
        return nonRepeatedElements;

    }


}
