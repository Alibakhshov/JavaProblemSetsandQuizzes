//Instructions:
//        Implement the Person class depicted in UML Class diagram using Java programming language.
//
//        Note: Pay attention that this class doesn't have the static main method, that's why it's not runnable.
//
//
//
//        Example of object initialization:
//        Person person = new Person("John", "Wick", "john@wick.com", 55);
//        Output format for the toString() method:
//
//        Person{name='John', lastName='Wick', email='john@wick.com', age=55}
//        Person UML Class diagram


package Week2;

public class Person {
    private String name;
    private String lastName;
    private String email;
    private int age;

    public Person(String name, String lastName, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Person{name='" + name + "', lastName='" + lastName + "', email='" + email + "', age=" + age + "}";
    }
}