package InterviewQ;

public class PrimeRange {
    public static void main(String[] args) {

        int count = 0;
        for(int num = 2; num<= 100; num++){
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i ==0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(num + " ");

            }
            count++;


        }
        System.out.println("\n Total prime numbers between 1 and 100:" + count);
    }

}
