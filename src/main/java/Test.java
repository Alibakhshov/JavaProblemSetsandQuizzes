public class Test {
    private String name;
    private int age;
    private String address;

    public Test(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + "Age: " + age + " Address: " + address;
    }


}