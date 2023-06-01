package be.intecbrussel.Deel2.ObserverPattern;

public class Influencer implements Observer{
    private String name;

    public Influencer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getName() + " received by:" + name);
    }
}
