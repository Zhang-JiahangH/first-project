package text.chapter11.pe2;

public class Student extends Person{
    // Define the status as a constant //
    enum classStatus{
        Freshman, Sophomore, Junior, Senior;
    }
    public classStatus status;

    // constructor //
    public Student(){ }
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
