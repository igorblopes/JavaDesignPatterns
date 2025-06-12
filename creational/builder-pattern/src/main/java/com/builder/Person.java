import java.time.LocalDate;
import java.text.MessageFormat;


public class Person {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String emailAddress;
    private final String phoneNumber;


    public Person(String firstName, String middleName, String lastName, 
        LocalDate dateofBirth, String emailAddress, String phoneNumber){
        
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateofBirth;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Person{ firstName='"+firstName+"', middleName='"+middleName+"', lastName='"+lastName+"', dateOfBirth='"+dateOfBirth+"', emailAddress='"+emailAddress+"', phoneNumber='"+phoneNumber+"' }";
    }
}