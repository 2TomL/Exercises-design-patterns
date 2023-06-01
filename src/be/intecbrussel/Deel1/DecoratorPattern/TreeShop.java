package be.intecbrussel.Deel1.DecoratorPattern;

public class TreeShop {
    public static void main(String[] args) {
        // Create tree
        ChristmasTree realTree = new RealChristmasTree();

        // Decorate tree
        ChristmasTree decoratedTree = new TreeTopper(new Garland(new BubbleLights(realTree)));

        // Print
        System.out.println(decoratedTree.decorate());
    }
}
