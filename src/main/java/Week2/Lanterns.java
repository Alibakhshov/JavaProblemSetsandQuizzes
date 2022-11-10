package Week2;

public class Lanterns {
    public static void main(String[] args) {
        Stars1();
        Space();
        Stars2();
        Space();
        Stars3();

    }

    public static void Space(){
        System.out.println();
    }

    public static void Stars1(){
        System.out.println("    *****\n" +
                "  *********\n" +
                "*************");
    }

    public static void Stars2(){
        System.out.println("    *****\n" +
                "  *********\n" +
                "*************\n" +
                "* | | | | | *\n" +
                "*************\n" +
                "    *****\n" +
                "  *********\n" +
                "*************");
    }

    public static void Stars3(){
        System.out.println("    *****\n" +
                "  *********\n" +
                "*************\n" +
                "    *****\n" +
                "* | | | | | *\n" +
                "* | | | | | *\n" +
                "    *****\n" +
                "    *****");
    }

}
