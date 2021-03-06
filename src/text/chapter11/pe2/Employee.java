package text.chapter11.pe2;

public class Employee extends Person{

    private String office, salary;
    private MyDate hireDate;

    // constructor //
    public Employee(){

    }
    public Employee(String n){
        super(n);
    }
    public Employee(String n, String a, String p, String e){
        super(n, a, p, e);
    }
    public Employee(String n, String o, String s, MyDate h){
        super(n);
        office = o;
        salary = s;
        hireDate = h;
    }
    public Employee(String n, String a, String p, String e, String o, String s, MyDate h){
        super(n, a, p, e);
        office = o;
        salary = s;
        hireDate = h;
    }

    // functions //
    public String getOffice(){
        return this.office;
    }
    public void setOffice(String o){
        this.office = o;
    }
    public String getSalary(){
        return this.salary;
    }
    public void setSalary(String s){
        this.salary = s;
    }
    public MyDate getHireDate(){
        return this.hireDate;
    }
    public void setHireDate(MyDate d){
        this.hireDate = d;
    }
}
