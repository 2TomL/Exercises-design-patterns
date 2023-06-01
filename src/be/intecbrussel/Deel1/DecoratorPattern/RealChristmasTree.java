package be.intecbrussel.Deel1.DecoratorPattern;

public class RealChristmasTree implements ChristmasTree{
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}
