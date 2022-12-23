//Instructions:
//        Write a Java program that uses the while loop to produce the following output:
//
//        *****
//        *****
//        *****
//        *****

package Week3;

public class StarSquare {
    public static void main(String[] args) {
        String string = "*****";
        int countLine = 0;
        while (countLine < 4) {
            System.out.println(string);
            countLine++;
        }
    }
}
