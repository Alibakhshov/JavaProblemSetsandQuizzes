package Final.Question3;

public class Customer {
    private String name;
    private String memberType;
    private int memberID;
    private static int memberCount = 0;

    public Customer(String name) {
        this.name = name;
        this.memberType = "None";
        this.memberID = 0;
    }

    public Customer(String name, String memberType) {
        this.name = name;
        this.memberType = memberType;
        this.memberID = ++memberCount;
    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString() {
        return "Name: " + name + ", Member Type: " + memberType + ", Member ID: " + memberID;
    }
}
