//Instructions:
//        Write a complete Java program in a class named WellFormed that prints the following output:
//
//        A well-formed Java program has
//        a main method with { and }
//        braces.
//
//        A System.out.println statement
//        has ( and ) and usually a
//        String that starts and ends
//        with a " character.
//        (But we type \" instead!)
//



package Week1;

public class WellFormed {
    public static void main(String[] args) {
        System.out.println("A well-formed Java program has\n" +
                "a main method with { and }\n" +
                "braces.\n" +
                "\n" +
                "A System.out.println statement\n" +
                "has ( and ) and usually a\n" +
                "String that starts and ends\n" +
                "with a \" character.\n" +
                "(But we type \\\" instead!)");
    }
}
