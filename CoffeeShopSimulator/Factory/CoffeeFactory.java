package CoffeeShopSimulator.Factory;
import CoffeeShopSimulator.Object.Coffee;

public interface CoffeeFactory {
    public Coffee createCoffee(String type);
}