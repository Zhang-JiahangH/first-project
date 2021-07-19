package text.chapter11.pe4;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem {

    /*
     11.4 (Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers.
     The method returns null if the list is null or the list size is 0.
     public static Integer max(ArrayList<Integer> list)
     Write a test program that prompts the user to enter a sequence of numbers ending
     with 0 and invokes this method to return the largest number in the input.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int value;

        do{
            System.out.print("Enter integers (input ends with 0): ");
            value = input.nextInt();
            list.add(value);
        } while (value != 0);

        int result = max(list);
        System.out.println("The maximum number is " + result);
    }

    // function //
    public static int max(ArrayList<Integer> list){
        int len = list.size();
        int max;
        if(len == 0){
            return -1;
        }
        else{
            max = list.get(0);
        }

        for(int temp:list){
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}
