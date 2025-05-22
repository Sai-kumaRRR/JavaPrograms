package InterviewQ.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {

        int[] arr = {1 , 2 , 2 , 4 , 4 , 5 , 6 , 6 , 6 ,7};
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i< arr.length; i++){
            if(visited[i] )continue;
            int count = 1;
            for(int j = i +1; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " ->" + count +(count == 1 ?"time":"times"));

        }
    }
}
