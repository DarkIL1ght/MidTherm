package CoffeeShopSimulator.Object;

public class Espresso implements Coffee {
    public Espresso() {
    }

    @Override
    public double getCost() { return 2.0; }
    @Override
    public String getDescription() { return "Espresso"; }
}