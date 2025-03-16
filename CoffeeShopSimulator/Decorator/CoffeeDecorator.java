package CoffeeShopSimulator.Decorator;

import CoffeeShopSimulator.Object.Coffee;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
}