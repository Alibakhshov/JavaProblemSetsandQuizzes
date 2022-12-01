package Quiz2;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Allergies {
    private final EnumSet<Allergen> allergicToItems = EnumSet.noneOf(Allergen.class);

    public Allergies(int score) {
        for (int allergicToItemsIndex = 0; allergicToItemsIndex < Allergen.values().length; allergicToItemsIndex++) {
            if ((score & (1 << Allergen.values()[allergicToItemsIndex].ordinal())) != 0) {
                allergicToItems.add(Allergen.values()[allergicToItemsIndex]);
            }
        }
    }

    public boolean isAllergicTo(Allergen allergen) {
        return allergicToItems.contains(allergen);
    }

    public List<Allergen> getList() {
        return new ArrayList<>(allergicToItems);
    }
}

