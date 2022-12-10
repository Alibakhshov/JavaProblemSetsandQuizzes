package Week11;

public class RaindropConverter {
    public String convert(int number) {
        String raindrop = "";
        if (number % 3 == 0) {
            raindrop += "Pling";
        }
        if (number % 5 == 0) {
            raindrop += "Plang";
        }
        if (number % 7 == 0) {
            raindrop += "Plong";
        }
        if (raindrop.equals("")) {
            raindrop += number;
        }
        return raindrop;
    }
}
