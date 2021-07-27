package text.chapter12.pe3;

import java.util.Scanner;

public class Problem {

    /*
     12.3
     (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
     ■ Creates an array with 100 randomly chosen integers.
     ■ Prompts the user to enter the index of the array, then displays the corresponding element value.
     If the specified index is out of bounds, display the message "Out of Bounds".
     */
    public static void main(String[] args) {

        int[] array = createArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an index of the array: ");
        int number = input.nextInt();
        // Prompts the user to enter the index of the array, then displays the corresponding element value.
        // If the specified index is out of bounds, display the message "Out of Bounds".
        try {
            System.out.println(array[number]);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Out of Bounds");
        }

    }
    // create an array with 100 randomly chosen integers
    public static int[] createArray(){
        int[] out = new int[100];
        for(int i=0; i<100; i++){
            int chose = (int)(Math.random()*100 + 1);
            out[i] = chose;
        }
        return out;
    }
}
