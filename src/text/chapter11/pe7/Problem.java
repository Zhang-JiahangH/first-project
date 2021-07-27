package text.chapter11.pe7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {

    /*
     11.7 (Shuffle List) Write the following method that shuffles the elements in an List of integers:
     public static void shuffle(List<Integer> list){
     */
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 2, 1, 3, 4, 5));
        shuffle(input);
        System.out.println(input);
    }

    // The main idea is to rearrange the cards in each position. (May repeat)
    public static void shuffle(List<Integer> list){
        int len = list.size();
        for(int i=0; i<len; i++){
            int temp = (int)(Math.random()*len);
            int tempNum = list.get(temp);
            list.set(temp, list.get(i));
            list.set(i, tempNum);
        }
    }
}
