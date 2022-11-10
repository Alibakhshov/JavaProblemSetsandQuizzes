package Week2;

public class StarFigures {
    public static void main(String[] args) {
        Horiz();
        Diag();
        Space();
        Horiz();
        Diag();
        Horiz();
        Space();
        Vert();
        Horiz();
        Diag();

    }

    public static void Horiz(){
        System.out.println("*****\n" +
                "*****");
    }

    public static void Diag(){
        System.out.println(" * *\n" +
                "  *\n" +
                " * *");
    }

    public static void Vert(){
        System.out.println("  *\n" +
                "  *\n" +
                "  *");
    }

    public static void Space() {
        System.out.println();
    }

}
