package Week11;

public class Grains {
    public long computeNumberOfGrainsOnSquare(int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return (long) Math.pow(2, square - 1);
    }

    public long computeTotalNumberOfGrainsOnBoard() {
        long sum = 0;
        for (int i = 1; i <= 64; i++) {
            sum += computeNumberOfGrainsOnSquare(i);
        }
        return sum;
    }
}