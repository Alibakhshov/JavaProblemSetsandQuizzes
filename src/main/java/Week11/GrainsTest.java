package Week11;

public class GrainsTest{
    public static void main(String[] args) {
        Grains grains = new Grains();
        System.out.println(grains.computeNumberOfGrainsOnSquare(1));
        System.out.println(grains.computeNumberOfGrainsOnSquare(2));
        System.out.println(grains.computeNumberOfGrainsOnSquare(3));
        System.out.println(grains.computeNumberOfGrainsOnSquare(4));
        System.out.println(grains.computeNumberOfGrainsOnSquare(16));
        System.out.println(grains.computeNumberOfGrainsOnSquare(32));
        System.out.println(grains.computeNumberOfGrainsOnSquare(64));
        System.out.println(grains.computeTotalNumberOfGrainsOnBoard());
    }
}