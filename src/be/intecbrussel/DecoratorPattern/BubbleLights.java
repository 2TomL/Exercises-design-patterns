package be.intecbrussel.DecoratorPattern;

public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree decoratedTree) {
        super(decoratedTree);
    }
    @Override
    public String decorate() {
        return super.decorate() + ", with bubble lights";
    }
}
