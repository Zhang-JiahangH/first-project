package text.chapter19.pe10;

public class Problem {

    /* 19.10
        (Largest element in an ArrayList) Write the following method that returns the
         largest element in an ArrayList:
         public static <E extends Comparable<E>> E max(ArrayList<E> list)
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }

}
