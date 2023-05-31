package be.intecbrussel.DecoratorPattern;

public class RealChristmasTree implements ChristmasTree{
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}
