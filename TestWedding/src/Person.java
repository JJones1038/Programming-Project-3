import java.time.LocalDate;

public class Person {
    
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    
    public Person(String first, String last, LocalDate date){
        this.firstName = first;
        this.lastName = last;
        this.birthDate = date;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public LocalDate getBirthDate(){
        return this.birthDate;
    }
}
