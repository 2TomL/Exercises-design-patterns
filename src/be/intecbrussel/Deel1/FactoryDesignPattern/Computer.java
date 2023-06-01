package be.intecbrussel.Deel1.FactoryDesignPattern;

abstract public class Computer {
    protected String ram;
    protected String cpu;
    protected String hdd;

    public Computer(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "be.intecbrussel.Deel1.FactoryDesignPattern.Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
