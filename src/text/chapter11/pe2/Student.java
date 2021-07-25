package text.chapter11.pe2;

public class Student extends Person{

    // Define the status as a constant //
    enum classStatus{
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR;
    }

    private classStatus status;

    // constructor //
    public Student(){ }

    public Student(String name){
        super(name);
    }
    public Student(String name, String age, String phone, String email){
        super(name, age, phone, email);
    }
    public Student(String name, classStatus status){
        super(name);
        setStatus(status);
    }
    public Student(String name, String age, String phone, String email, classStatus setStatus){
        super(name, age, phone, email);
        status = setStatus;
    }

    // status //
    public void getStatus(){
        System.out.println(this.status);
    }

    // set the class status by year //
    public void setStatus(classStatus setStatus){
        status = setStatus;
    }
}
