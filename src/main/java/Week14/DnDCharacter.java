package Week14;

public class DnDCharacter {
    public static int ability() {
        int[] rolls = new int[4];
        for (int i = 0; i < 4; i++) {
            rolls[i] = roll();
        }
        int min = rolls[0];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (rolls[i] < min) {
                min = rolls[i];
            }
            sum += rolls[i];
        }
        return sum - min;
    }

    public static int modifier(int input) {
        return (int) Math.floor((input - 10) / 2);
    }

    public static int getStrength() {
        return ability();
    }

    public static int getDexterity() {
        return ability();
    }

    public static int getConstitution() {
        return ability();
    }

    public static int getIntelligence() {
        return ability();
    }

    public static int getWisdom() {
        return ability();
    }

    public static int getCharisma() {
        return ability();
    }

    public static int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    private static int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}
