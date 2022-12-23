//Instructions:
//        We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Implement a Java static method maxMirror() that returns the size of the largest mirror section found in the given array. The inputs size <= 100.
//
//        maxMirror ( [ 1, 2, 3, 8, 9, 3, 2, 1] ) → 3
//        maxMirror ( [ 7, 1, 2, 9, 7, 2, 1 ] ) → 2
//        Input:
//        ghost@pc:~$
//        1 2 3 8 9 3 2 1
//        Output:
//        3

package Week5;

import java.util.Scanner;
import java.util.ArrayList;

public class MaxMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine().replaceAll(" ", "");
        System.out.print(maxMirror(inputString));
    }

    public static int maxMirror(String integersString) {
        int largestMirrorLength = 0;
        for (int counter = 0; counter < integersString.length(); counter++) {
            char integer = integersString.charAt(counter);
            ArrayList<Integer> integerIndices = new ArrayList<>();
            int integerIndex = integersString.indexOf(integer);
            if (integerIndex != integersString.length() - 1) {
                for (int index = integerIndex + 1; index < integersString.length(); index++) {
                    if (integersString.charAt(index) == integer) {
                        integerIndices.add(index);
                    }
                }
            }
            for (int sequenceStart: integerIndices) {
                int mirrorLength = 0;
                integerIndex = integersString.indexOf(integer);
                while (integersString.charAt(integerIndex) == integersString.charAt(sequenceStart) &&
                        integerIndex < sequenceStart) {
                    mirrorLength++;
                    integerIndex++;
                    sequenceStart--;
                }
                if (mirrorLength > largestMirrorLength) {
                    largestMirrorLength = mirrorLength;
                }
            }
        }
        return largestMirrorLength;
    }
}
