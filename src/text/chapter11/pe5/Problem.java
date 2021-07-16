package text.chapter11.pe5;

public class Problem {

    /*
    11.5 (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList to replace an array to store students.
    You should not change the original contract of the Course class
    (i.e., the defi- nition of the constructors and methods should not be changed, but the private members may be changed.)
    */
    public static void main(String[] args) {

        Course math = new Course("Calculus");
        System.out.println(math);

        String bob = "Bob";
        math.addStudent("Bob");
        System.out.println(math);

        math.addStudent("Joe");
        System.out.println(math);

        System.out.println("Course name is: " + math.getCourseName());

        System.out.println("Total students: " + math.getNumberOfStudents());

        math.dropStudent(bob);
        System.out.println(math);
    }
}
