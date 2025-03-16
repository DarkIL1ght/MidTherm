package CoffeeShopSimulator.Factory;

import CoffeeShopSimulator.Object.Cappuccino;
import CoffeeShopSimulator.Object.Coffee;
import CoffeeShopSimulator.Object.Espresso;

public class ConcreteFactoryClass implements CoffeeFactory{
    @Override
    public Coffee createCoffee(String type) {
        return switch(type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Unknown coffee type");
        };
    }
}
