package be.intecbrussel.Deel2.ObserverPattern;

public class InFailApp {
    public static void main(String[] args) {
        Company company = new Company();

        Influencer influencer = new Influencer("Jenny Shoes");
        Influencer influencer1 = new Influencer("Franky Lipstick");
        Influencer influencer2 = new Influencer("Conny Make up");

        company.addObserver(influencer1);
        company.addObserver(influencer2);
        company.addObserver(influencer);

        company.createNewProduct("Shiny shoes");
        company.createNewProduct("Sparkling lipstick");
        company.createNewProduct("Shiny shoes");
    }
}
