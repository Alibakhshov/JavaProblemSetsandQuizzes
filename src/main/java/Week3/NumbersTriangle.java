//Instructions:
//        Write a Java program that uses the nested-while loops to produce the following output:
//
//        1
//        22
//        333
//        4444
//        55555
//        666666
//        7777777

package Week3;

public class NumbersTriangle {
    public static void main(String[] args) {
        int countLine = 1;
        while (countLine < 8) {
            int countNumber = 1;
            while (countNumber < countLine + 1) {
                System.out.print(countLine);
                countNumber++;
            }
            System.out.println();
            countLine++;
        }
    }
}