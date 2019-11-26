package unklick.klinik.model;
import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthdayDate;

    //Setter
    public void setPetType(PetType petType){
        this.petType = petType;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    public void setLocalDate(LocalDate birthdayDate){
        this.birthdayDate = birthdayDate;
    }
    //Getter
    public PetType getPetType(){
        return petType;
    }
    public Owner getOwner(){
        return owner;
    }
    public LocalDate getBirthdayDate(){
        return birthdayDate;
    }
}
