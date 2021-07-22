package text.chapter11.pe2;

public class Faculty extends Employee{

    private String officeHours, rank;

    // constructor //
    public Faculty(){

    }
    public Faculty(String n){
        super(n);
    }
    public Faculty(String n, String a, String p, String e){
        super(n, a, p, e);
    }
    public Faculty(String n, String o, String r){
        super(n);
        this.officeHours = o;
        this.rank = r;
    }
    public Faculty(String n, String a, String p, String e, String o, String r){
        super(n, a, p, e);
        this.officeHours = o;
        this.rank = r;
    }

    // functions //
    public String getOfficeHours(){
        return this.officeHours;
    }
    public void setOfficeHours(String o){
        this.officeHours = o;
    }
    public String getRank(){
        return this.rank;
    }
    public void setRank(String r){
        this.rank = r;
    }

}
