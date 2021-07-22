package text.chapter11.pe2;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    // constructor //
    public Person(){

    }
    public Person(String inputName){
        this.name = inputName;
    }
    public Person(String inputName, String inputAddress, String inputPhoneNumber, String inputEmail){
        this.name = inputName;
        this.address = inputAddress;
        this.phoneNumber = inputPhoneNumber;
        this.email = inputEmail;
    }

    // functions //
    public String getName(){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String inputAdress){
        this.address = inputAdress;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String inputPhoneNumber){
        this.phoneNumber = inputPhoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String inputEmail){
        this.email = inputEmail;
    }

    public String toString(){
        return "Name: " + getName() + " Class: " + this.getClass().getSimpleName();
    }
}
