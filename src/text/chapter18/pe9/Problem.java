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
        reverseDisplay2(value);
    }

    public static void reverseDisplay(String value){
        int len = value.length();
        if(len!=0){
            System.out.print(value.charAt(len-1));
            value = value.substring(0,len-1);
            if(value.length()!=0){
                reverseDisplay(value);
            }
        }
    }

    public static void reverseDisplay2(String value){
        reverseDisplay2Helper(value, value.length()-1);
    }

    // Though you cannot change the method signature that is given, you can easily create another "helper" method
    public static void reverseDisplay2Helper(String value, int pos){
        if(pos < 0 ){
            return;
        }
        System.out.print(value.charAt(pos));
        reverseDisplay2Helper(value, pos-1);
    }
}
