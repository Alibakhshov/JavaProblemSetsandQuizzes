//Instructions:
//        Write a Java program that implements the design described by the UML Class diagram given below.
//        Employee uml class diagram
//
//Method toString():
//        Every well-designed Java class should contain a public method called toString() that returns a short description of the instance (in a return type of String). The toString() method can be called explicitly (via instanceName.toString()) just like any other method; or implicitly through println(). If an instance is passed to the println(anInstance) method, the toString() method of that instance will be invoked implicitly.

package Week2;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String id;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.id = "";
    }

    public Employee(String firstName, String lastName, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Employee{firstName='"
                + this.firstName + "', lastName='"
                + this.lastName + "', email='"
                + this.email + "', id='"
                + this.id + "'}";
    }
}