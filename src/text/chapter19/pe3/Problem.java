package text.chapter19.pe3;
import java.util.Scanner;

public class Problem {

    /* 19.3
        (Distinct elements in ArrayList) Write the following method that returns a new ArrayList.
        The new list contains the nonduplicate elements from the original list.
        public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
     */
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("Hello");
        }

        strings = removeDuplicates(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> newList = new ArrayList<>(list.size());
        for (E aList : list) {
            if (!newList.contains(aList)) {
                newList.add(aList);
            }
        }
        return newList;
    }

}
