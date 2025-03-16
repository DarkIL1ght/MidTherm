package CoffeeShopSimulator.Object;

public class Cappuccino implements Coffee {
    public Cappuccino() {
    }

    @Override
    public double getCost() { return 3.0; }
    @Override
    public String getDescription() { return "Cappuccino"; }
}