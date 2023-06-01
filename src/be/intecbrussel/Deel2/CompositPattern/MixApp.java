package be.intecbrussel.Deel2.CompositPattern;

public class MixApp {
    public static void main(String[] args) {
        Mix mix1 = new Mix();
        mix1.addIngredient(new Banana());
        mix1.addIngredient(new Apple());
        mix1.addIngredient(new Sugar());
        mix1.mix();

        Mix mix2 = new Mix();
        mix2.addIngredient(new Apple());
        mix2.addIngredient(new Salt());
        mix2.mix();
    }
}
