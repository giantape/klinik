package unklick.klinik.model;

public class Person extends BaseEntity {
    private String firstName, lastName;
//    public Person(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    // Setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public  void  setLastName(String lastName){
        this.lastName = lastName;
    }

    // Getter
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
