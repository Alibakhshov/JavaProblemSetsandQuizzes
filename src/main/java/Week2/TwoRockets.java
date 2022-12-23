//Instructions:
//        Write a complete Python program in a file named TwoRockets that generates the following output. Use methods to show structure and eliminate redundancy in your solution.
//
//        Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? What redundancy cannot be eliminated?
//
//        /\       /\
//        /  \     /  \
//        /    \   /    \
//        +------+ +------+
//        |      | |      |
//        |      | |      |
//        +------+ +------+
//        |  KG  | |  KG  |
//        |Soonun| |Soonun|
//        +------+ +------+
//        |      | |      |
//        |      | |      |
//        +------+ +------+
//        /\       /\
//        /  \     /  \
//        /    \   /    \

package Week2;

public class TwoRockets {
    public static void main(String[] args) {
        Up();
        Middle();
        Text();
        Middle();
        Up();
    }

    public static void Up(){
        System.out.println("   /\\       /\\\n" +
                "  /  \\     /  \\\n" +
                " /    \\   /    \\");
    }

    public static void Middle(){
        System.out.println("+------+ +------+\n" +
                "|      | |      |\n" +
                "|      | |      |\n" +
                "+------+ +------+");
    }

    public static void Text(){
        System.out.println("|  KG  | |  KG  |\n" +
                "|Soonun| |Soonun|");
    }
}
