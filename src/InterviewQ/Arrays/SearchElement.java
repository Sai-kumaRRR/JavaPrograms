package InterviewQ.Arrays;

// search element in an array.

public class SearchElement {
    public static void main(String[] args) {
        int[] array = {3 , 5 , 7 , 9 , 2 , 1};
        int target = 4;

        int index = linearSearch(array,target);

        if(index != -1){
            System.out.println("element "+ target + " found at index" + index);

        }else{
            System.out.println("Element" + target + "not found in the array");

        }
    }
    public static int linearSearch(int[]array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i; // element found , return index
            }
        }
        return -1;
    }
}
