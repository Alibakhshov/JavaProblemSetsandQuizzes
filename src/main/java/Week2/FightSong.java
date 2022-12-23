//Instructions:
//        Write a complete Java program in a file named FightSong that generates the following three figures of output. Use  methods to show structure and eliminate redundancy in your solution.
//
//        In particular, make sure that main contains no System.out.println() statements, that any System.out.println() statement(s) repeated are captured in a method that is called just once, and that the same System.out.println() statement never appears in two places in the code.
//
//        Go, team, go!
//        You can do it.
//
//        Go, team, go!
//        You can do it.
//        You're the best,
//        In the West.
//        Go, team, go!
//        You can do it.
//
//        Go, team, go!
//        You can do it.
//        You're the best,
//        In the West.
//        Go, team, go!
//        You can do it.
//
//        Go, team, go!
//        You can do it.

package Week2;

public class FightSong {
    public static void main(String[] args) {
        Text1();
        Space();
        Text1();
        Text2();
        Text1();
        Space();
        Text1();
        Text2();
        Text1();
        Space();
        Text1();


    }

    public static void Text1() {
        System.out.println("Go, team, go!\n" +
                "You can do it.");
    }

    public static void Space(){
        System.out.println();
    }

    public static void Text2(){
        System.out.println("You're the best,\n" +
                "In the West.");

    }
}
