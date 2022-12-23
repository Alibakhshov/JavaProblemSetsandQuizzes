//Instructions:
//        Write a complete Python program in a file named Lanterns that generates the following three figures of output. Use methods to show structure and eliminate redundancy in your solution.
//
//        In particular, make sure that main contains no System.out.println() statements except for blank lines, that any System.out.println() statement(s) repeated are captured in a method that is called just once, and that the same System.out.println() statement never appears in two places in the code.
//
//        *****
//        *********
//        *************
//
//        *****
//        *********
//        *************
//        * | | | | | *
//        *************
//        *****
//        *********
//        *************
//
//        *****
//        *********
//        *************
//        *****
//        * | | | | | *
//        * | | | | | *
//        *****
//        *****

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
