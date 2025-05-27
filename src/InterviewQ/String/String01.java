package InterviewQ.String;

//java program to gives output for the input Sting str.
public class String01 {
    public static void main(String[] args) {

        String input = "34268754";
        String output = rearrangeDigits(input);
        System.out.println("output"+output);

    }
    public static String rearrangeDigits(String input){
        /// spilt the input into parts digits and non digits
        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigits = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                digits.append(c);

            }else{
                nonDigits.append(c);
            }
        }
        //concatenate non digits followed by digits.
        return digits.toString() + nonDigits;
    }
}
