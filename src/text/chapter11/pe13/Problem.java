package text.chapter11.pe13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {

    /*
     11.13
     (Remove duplicates) Write a method that removes the duplicate elements from an  list of integers. The input can
     just be a static list of integers as shown in main below
     */
    public static void main(String[] args) {
        // I change this line because I found it'll be impossible to use methods like add/remove
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 2, 1, 3, 4, 5));
        removeDuplicate(input);
        System.out.println(input);
    }


    public static void removeDuplicate(List<Integer> list){
        int len = list.size();
        for(int i=0; i<list.size()-1; i++){
            for(int j=list.size()-1; j>i; j--){
                if(list.get(i)==(list.get(j))){
                    list.remove(j);
                }
            }
        }
    }
}
