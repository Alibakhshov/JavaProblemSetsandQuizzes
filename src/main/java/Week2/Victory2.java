//Instructions:
//        Write a complete Java program in a file named Victory2 that prints the following output. Use at least one method besides main to remove redundancy.
//
////////////////////////
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\

package Week2;

public class Victory2 {
    public static void main(String[] args) {
        Texts();
    }

    public static void Texts() {
        String[] text = {"//////////////////////", "|| Victory is mine! ||", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"};
        System.out.println(text[0]);
        System.out.println(text[1]);
        System.out.println(text[2]);
        System.out.println(text[1]);
        System.out.println(text[2]);
        System.out.println(text[1]);
        System.out.println(text[2]);
        System.out.println(text[1]);
        System.out.println(text[2]);
        System.out.println(text[1]);
        System.out.println(text[2]);
    }
}
