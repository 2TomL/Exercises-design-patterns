package be.intecbrussel.Deel1.DecoratorPattern;

public class TreeTopper extends TreeDecorator{
    public TreeTopper(ChristmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " and with tree topper.";
    }
}
