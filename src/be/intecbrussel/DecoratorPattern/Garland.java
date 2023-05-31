package be.intecbrussel.DecoratorPattern;

public class Garland extends TreeDecorator{
    public Garland(ChristmasTree decoratedTree) {
        super(decoratedTree);
    }
    @Override
    public String decorate() {
        return super.decorate() + ", with garlands";
    }
}
