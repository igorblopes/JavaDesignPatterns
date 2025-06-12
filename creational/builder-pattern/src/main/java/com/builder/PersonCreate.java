import java.time.LocalDate;

public class PersonCreate {

    public static void main(String[] args){

        // Difficult to read and maintain
        var person1 = new Person("Person", "One", "Name", LocalDate.of(1983, 9, 21), "example@gmail.com", null);
        showPerson(person1);

        // Difficult to read and maintain
        var person2 = new Person("Person", "Two", "Name", LocalDate.of(1999, 3, 7), "example2@gmail.com", "123456789");
        showPerson(person2);


        var personBuilder1 = new PersonPattern.PersonBuilder()
                .firstName("Person")
                .middleName("One")
                .lastName("Builder")
                .emailAddress("builderOne@gmail.com")
                .build();

        showPerson(personBuilder1);


        var personBuilder2 = new PersonPattern.PersonBuilder()
                .firstName("Person")
                .middleName("Two")
                .lastName("Builder")
                .phoneNumber("1232211112")
                .build();

        showPerson(personBuilder2);
    }

    private static void showPerson(Person person) {
        System.out.println("The person will be shown: \n"+person);
    }

    private static void showPerson(PersonPattern person) {
        System.out.println("The person will be shown: \n"+person);
    }

}