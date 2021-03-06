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
        int output = countAnswer(input,'l');
        System.out.println(output);
    }

    public static int count(String str, char a){
        int num = 0;
        int index = str.indexOf(a);
        if(index==-1){
            return num;
        }
        else{
            return num = 1+ count(str.substring(index+1), a);
        }
    }

    public static int countAnswer(String str, char a){
        return countAnswerHelper(str.toLowerCase(), a, 0);
    }

    public static int countAnswerHelper(String str, char a, int i){
        if( i >= str.length() ){
            return 0;
        }
        int add = str.charAt(i) == a ? 1 : 0;
        return countAnswerHelper(str, a, i + 1) + add;
    }
}
