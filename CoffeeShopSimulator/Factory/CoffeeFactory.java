package CoffeeShopSimulator.Factory;
import CoffeeShopSimulator.Object.Coffee;

interface CoffeeFactory {
    public Coffee createCoffee(String type);
}