package text.chapter19.pe4;

public class Problem {

    /* 19.4
       (Generic linear search) Implement the following generic method for linear search:
        public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
     */
    public static void main(String[] args) {
        Integer[] list = new Integer[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(linearSearch(list, 10));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

}
