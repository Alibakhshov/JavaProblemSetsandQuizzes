import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Allergies {
    private final EnumSet<Allergen> allergens = EnumSet.noneOf(Allergen.class);

    public Allergies(int score) {
        for (int allergenIndex = 0; allergenIndex < Allergen.values().length; allergenIndex++) {
            if ((score & (1 << Allergen.values()[allergenIndex].ordinal())) != 0) {
                allergens.add(Allergen.values()[allergenIndex]);
            }
        }
    }

    public boolean isAllergicTo(Allergen allergen) {
        return allergens.contains(allergen);
    }

    public List<Allergen> getList() {
        return new ArrayList<>(allergens);
    }
}