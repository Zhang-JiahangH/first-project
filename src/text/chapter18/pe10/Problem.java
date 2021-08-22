package text.chapter18.pe10;

public class Problem {

    /*
    18.10
    (Occurrences of a specified character in a string) Write a recursive method that finds the number of occurrences
    of a specified letter in a string using the following method header:
     public static int count(String str, char a)
     For example, count("Welcome", 'e') returns 2.
     */
    public static void main(String[] args) {
        String input = "Hello World!";
        int output = count(input,'H');
        System.out.println(output);
    }

    // TODO while this does produce the correct output, this method is not recursive
    public static int count(String str, char a){
        int num = 0;
        int index = str.indexOf(a);
        if(index!=-1){
            str = str.substring(0,index) + str.substring(index+1);
            num++;
        }
        if(str.indexOf(a)!=-1){
            num+=count(str,a);
        }
        return num;
    }
}