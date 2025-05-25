package InterviewQ.Arrays;

//find minimum and maximum from an array.
public class Minimum_Maximum {
    public static void main(String[] args) {
        int[]array = {1 , 3 , 5 , 6 , 8};

        //find maximum and minimum
        int max = findMaximum(array);
        int min = findMinimum(array);

        //Print the results
        System.out.println("minimum value in the array"+ min);
        System.out.println("maximum value in the array"+ max);

    }
    public static int findMaximum(int[] array){
        if(array.length ==0){
            throw new IllegalArgumentException("Array must not be empty");

        }
        int max = array[0]; // Initialize max to the first element.
        for(int i = 1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];

            }
        }
        return max;
    }
    public static int findMinimum(int[]array){
        if(array.length ==0){
            throw new IllegalArgumentException("Array must not be empty");

        }
        int min = array[0]; //Intialize min to the first element.
        for(int i =1; i< array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
