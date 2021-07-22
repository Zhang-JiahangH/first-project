package text.chapter11.pe2;

public class Problem {

    /*
     11.2 (The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee.
     Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and e-mail address.
     A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired.
     A faculty member has a rank. A staff member has a title. Override the toString method in each class to display the class name and the person’s name.
     */
    public static void main(String[] args) {

        // TODO very good test code showing usage
        // test of constructor //
        Person person = new Person("Harry");
        Person student = new Student("Lucy", Student.classStatus.FRESHMAN);
        MyDate mydate = new MyDate(7,25,2002);
        Person employee = new Employee("Carlos","Health Center", "10000", mydate);
        Person faculty = new Faculty("Jason","10:00 - 12:00", "1");
        Person staff = new Staff("Jack","Dean");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
