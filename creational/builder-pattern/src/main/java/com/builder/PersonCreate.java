import java.time.LocalDate;

public class PersonCreate {

    public static void main(String[] args){

        // Difficult to read and maintain
        var person1 = new Person("Person", "One", "Name", LocalDate.of(1983, 9, 21), "example@gmail.com", null);
        showPerson(person1);

        // Difficult to read and maintain
        var person2 = new Person("Person", "Two", "Name", LocalDate.of(1999, 3, 7), "example2@gmail.com", "123456789");
        showPerson(person2);

    }

    private static void showPerson(Person person) {
        System.out.println("The person will be shown: \n"+person);
    }

}