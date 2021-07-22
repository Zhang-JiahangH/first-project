package text.chapter11.pe2;

public class Staff extends Employee{

    private String title;

    // constructor //
    public Staff(){

    }
    public Staff(String n){
        super(n);
    }
    public Staff(String n, String a, String p, String e){
        super(n, a, p, e);
    }
    public Staff(String n, String t){
        super(n);
        this.title = t;
    }
    public Staff(String n, String a, String p, String e, String t){
        super(n, a, p, e);
        this.title = t;
    }

    // functions //
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String t){
        this.title = t;
    }
}
