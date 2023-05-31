package be.intecbrussel.FactoryDesignPattern;

public class PC extends Computer{

    public PC(String ram, String cpu, String hdd) {
        super(ram, cpu, hdd);
    }

    @Override
    public String toString() {
        return "Your be.intecbrussel.FactoryDesignPattern.PC" + super.toString();
    }
}
