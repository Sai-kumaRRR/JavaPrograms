package InterviewQ.Arrays;

// Array consist of integers and special characters , sum only integers.
public class Array02 {
    public static void main(String[] args) {
        String[] array = {"4", "6 ","2","8","9"};

        int sum = sumIntegers(array);
        System.out.println("sum of integers in the arrays "+sum);
}
public static int sumIntegers(String[] arrays){
        int sum = 0;
        for(String element : arrays){
            try{
                int num = Integer.parseInt(element);
                sum += num;

            }catch(NumberFormatException e){

            }
        }
        return sum;
    }
}
