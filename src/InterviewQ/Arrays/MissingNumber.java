package InterviewQ.Arrays;
// find the missing number in array.
public class MissingNumber {
    public static void main(String[] args) {
        int[] Array = {1 , 3 , 4 , 5 , 8 , 6}; // missing number is 2
        int missingNumber = findmissingnumber(Array);
        System.out.println("The missing number is"+ missingNumber);


    }
    public static int findmissingnumber(int[]Array){
        int n = Array.length + 1; //  since one number is missing the length

        int totalnum = n +(n+1)/2; //sum of first a natural numbers

        int ArraySum = 0;
        for(int num : Array){
            ArraySum += num;

        }
        return totalnum = ArraySum;
    }
}
