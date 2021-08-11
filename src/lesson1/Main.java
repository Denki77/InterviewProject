package lesson1;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .setFirstName("Mary")
                .setLastName("Brown")
                .setMiddleName("V")
                .setAge(15)
                .setPhone("7999-999-99-99")
                .setGender("M")
                .build();

        System.out.println( person.toString());
        Person person2 = Person.builder().setPhone("7255").build();
        System.out.println( person2.toString());
    }
}
