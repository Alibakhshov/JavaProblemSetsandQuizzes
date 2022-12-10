package Week11;

public class PangramChecker {
    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if (input.toLowerCase().indexOf(alphabet.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
