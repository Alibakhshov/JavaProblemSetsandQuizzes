package Week2;

public class PersonDriver {
    public static void main(String[] args) {
        Person firstName = new Person();
        Person lastName = new Person();
        Person email = new Person();
        Person age = new Person();

        firstName.setName("John");
        System.out.println(firstName.getName());
        lastName.setName("Wick");
        System.out.println(lastName.getName());
        email.setName("john@wick.com");
        System.out.println(email.getName());
        age.setName("55");
        System.out.println(age.getName());
    }
}
