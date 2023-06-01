package be.intecbrussel.Deel2.CompositPattern;

import java.util.ArrayList;
import java.util.List;

public class Mix implements Ingredient {
    private List<Ingredient> ingredients;

    public Mix() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void mix() {
        if (ingredients.isEmpty()) {
            System.out.println("No ingredients added to mix.");
        } else {
            System.out.println("Mixing the ingredients:");
            for (Ingredient ingredient : ingredients) {
                ingredient.mix();
            }
        }
    }
}