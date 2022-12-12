package Week14;

public class ResistorColorDuo {
    public int value(String[] colors) {
        int value = 0;
        for (int i = 0; i < 2; i++) {
            value = value * 10 + colorCode(colors[i]);
        }
        return value;
    }

    public int colorCode(String color) {
        String[] colors = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < colors.length; i++) {
            if (color.equals(colors[i])) {
                return i;
            }
        }
        return -1;
    }
}
