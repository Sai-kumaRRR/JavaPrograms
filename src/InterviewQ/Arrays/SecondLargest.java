package InterviewQ.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10 , 45 , 78 , 67 , 98 , 34};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
               second = num;
            }
        }
        if(second == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");

        } else {
            System.out.println("Second largest number is" + second);

            }
        }
    }

