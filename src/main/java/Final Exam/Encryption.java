package Final;

public class Encryption {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                output += ' ';
            } else {
                output += (char) (c + 1);
            }
        }
        System.out.println(output);
    }
}

