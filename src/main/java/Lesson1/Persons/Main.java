package Lesson1.Persons;

public class Main {
    public static void main(String[] args) {
        Person person1 = Person.newBuilder()
                .setBuildFirstName("Мешкова")
                .setBuildLastName("Вера")
                .setBuildMiddleName("Александровна")
                .setBuildCountry("Россия")
                .setBuildAddress("Краснодар")
                .setBuildPhone("+73222232233")
                .setBuildGender("женский")
                .setBuildAge(36)
                .build();

        System.out.println(person1);

    }
}

