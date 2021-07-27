package text.chapter12.pe30;

import java.util.Scanner;

public class Problem {

    /*
     12.30
     (Occurrences of each letter) Write a method that displays the
     occurrences of each letter in the string. Letters are case insensitive. Here is a sample run:

     Input = "ABCAA"

     Number of As: 3
     Number of Bs: 1
     Number of Cs: 1
     ...
     Number of Zs: 0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String temp = input.nextLine();
        // case insensitive
        temp = temp.toUpperCase();
        int len = temp.length();
        char[] test = new char[len];
        temp.getChars(0, len, test, 0);
        // initialization of the output
        int[] count = new int[26];
        for(int i=0; i<26; i++){
            count[i] = 0;
        }
        // start to count letters
        for(int j=0; j<len; j++){
            int targ = test[j] - 'A';
            if((targ >=0)&&(targ <=26)){
                count[targ]++;
            }
        }
        // display the output
        for (int i = 0; i < 26; i++) {
            System.out.println("Number of "+(char)(i + 'A') + "s: " + count[i]);
        }
    }
}
