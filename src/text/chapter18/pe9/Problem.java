package text.chapter18.pe9;
import java.util.Scanner;

public class Problem {

    /*
    18.9
    (Print the characters in a string reversely) Write a recursive method that dis- plays a string reversely on the
    console using the following header: public static void reverseDisplay(String value)
     For example, reverseDisplay("abcd") displays dcba.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String value = input.nextLine();
        reverseDisplay(value);
    }

    public static void reverseDisplay(String value){
        int len = value.length();
        char[] output = new char[len];
        for(int i=len-1; i>=0; i--){
            output[len-i-1] = value.charAt(i);
        }
        String out = new String(output);
        System.out.println(out);
    }
}
