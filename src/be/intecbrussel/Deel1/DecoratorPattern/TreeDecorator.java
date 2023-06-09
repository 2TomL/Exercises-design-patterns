package be.intecbrussel.Deel1.DecoratorPattern;

public class TreeDecorator implements ChristmasTree{
    protected ChristmasTree decoratedTree;

    public TreeDecorator(ChristmasTree decoratedTree) {
        this.decoratedTree = decoratedTree;
    }

    @Override
    public String decorate() {
        return decoratedTree.decorate();
    }
}
