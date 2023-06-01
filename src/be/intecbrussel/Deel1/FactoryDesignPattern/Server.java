package be.intecbrussel.Deel1.FactoryDesignPattern;

public class Server extends Computer{
    public Server(String ram, String cpu, String hdd) {
        super(ram, cpu, hdd);
    }

    @Override
    public String toString() {
        return "Your be.intecbrussel.Deel1.FactoryDesignPattern.Server" + super.toString();
    }
}
