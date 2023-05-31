package be.intecbrussel.FactoryDesignPattern;

public class ComputerFactory {
    public static Computer createComputer (String computerType, String ram, String cpu, String hdd) {
        if (computerType.equalsIgnoreCase("PC")) {
            return new PC(ram, cpu, hdd);
        } else if (computerType.equalsIgnoreCase("SERVER")) {
            return new Server(ram, cpu, hdd);
        } else {
            return null;
        }
    }
}
