package be.intecbrussel.Deel1.FactoryDesignPattern;

public class PC extends Computer{

    public PC(String ram, String cpu, String hdd) {
        super(ram, cpu, hdd);
    }

    @Override
    public String toString() {
        return "Your be.intecbrussel.Deel1.FactoryDesignPattern.PC" + super.toString();
    }
}
