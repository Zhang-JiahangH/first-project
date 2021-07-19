package text.chapter11.pe2;

public class Student extends Person{

    // TODO when project get bigger this should be in it's own enum class, but for the scope of this assignment this is fine
    // Define the status as a constant //
    enum classStatus{

        // TODO enums typically all caps, i.e. SENIOR
        Freshman, Sophomore, Junior, Senior;
    }

    // TODO should this be public? Look up "data encapsulation"
    public classStatus status;

    // constructor //
    public Student(){ }

    // TODO applies to this and all other constructors, it'd be better to use the full name of the paramater, ex, "name"
    public Student(String n){
        super(n);
    }
    public Student(String n, String a, String p, String e){
        super(n, a, p, e);
    }
    public Student(String n, int status){
        super(n);
        setStatus(status);
    }
    public Student(String n, String a, String p, String e, int status){
        super(n, a, p, e);
        setStatus(status);
    }

    // status //
    public void getStatus(){
        System.out.println(this.status);
    }

    // set the class status by year //
    // TODO I think it is better to pass in the enum directly and not have this int to enum conversion
    public void setStatus(int year){
        if((year < 1)||(year > 4)){
            System.out.println("input is out of index.");
        }
        else if(year == 1){
            status = classStatus.Freshman;
        }
        else if(year == 2){
            status = classStatus.Sophomore;
        }
        else if(year == 3){
            status = classStatus.Junior;
        }
        else{
            status = classStatus.Senior;
        }
    }

    // toString //
    public String toString() {
        return "Name: " + getName() + " Class: Student";
    }
}
