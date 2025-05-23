
// find first and last element of arraylist.

package InterviewQ.Arrays;

import java.util.ArrayList;

public class LastElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("graphics");
        arrayList.add("banana");
        arrayList.add("orange");

        if (!arrayList.isEmpty()) {
            String firstElement = arrayList.get(0);
            String lastElement = arrayList.get(arrayList.size() - 1);
            System.out.println("first element" + firstElement);
            System.out.println("last element" + lastElement);

        }else{
            System.out.println("The arrayList is empty");


    }









    }
}
