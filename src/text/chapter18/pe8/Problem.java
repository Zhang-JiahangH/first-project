package text.chapter18.pe8;
import java.util.Scanner;

public class Problem {

    /* 18.8
     (Print the digits in an integer reversely) Write a recursive method that displays an int value reversely on
     the console using the following header: For example, reverseDisplay(12345) displays 54321.

     The original problem asks you to "Write a test program that prompts the user to enter an integer and
     displays its reversal." but you don't need to do the "Write a test program that prompts the user to enter an integer"
     portion as you've demonstrate knowledge of that already. I'll continue to remove unneeded program requirements
     to save you time.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = input.nextInt();
        reverseDisplay(value);
    }

    // TODO while this does produce the correct output, this method is not recursive
    public static void reverseDisplay(int value){
        int output = 0;
        while(value>0){
            int temp = value % 10;
            value/=10;
            output = output*10 + temp;
        }
        System.out.println("Reversed number is "+output);
    }
}
