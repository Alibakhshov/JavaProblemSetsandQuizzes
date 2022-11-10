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
