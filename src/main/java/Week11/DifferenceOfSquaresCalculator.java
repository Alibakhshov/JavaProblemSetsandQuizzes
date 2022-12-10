package Week11;

public class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i * i;
        }
        return sum;
    }

    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
