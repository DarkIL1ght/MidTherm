package CoffeeShopSimulator;

import CoffeeShopSimulator.Decorator.ChocolateDecorator;
import CoffeeShopSimulator.Decorator.MilkDecorator;
import CoffeeShopSimulator.Factory.CoffeeFactory;
import CoffeeShopSimulator.Factory.ConcreteFactoryClass;
import CoffeeShopSimulator.Object.Coffee;
import OnlinePaymentGateway.Factory.ConcretePaymentFactory;
import OnlinePaymentGateway.Factory.PaymentFactory;
import OnlinePaymentGateway.PaymentTypes.PaymentType;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PaymentFactory Factory = new ConcretePaymentFactory();
        CoffeeFactory factory = new ConcreteFactoryClass();
        PaymentType kaspiPayment = Factory.createPayment("creditcard", "1234-5678-9012-3456", 3);
        PaymentType paypalPayment = Factory.createPayment("paypal", "Darhan_ID@", 2.5);
        while (true) {

            System.out.println("Kaspi balance:$"+kaspiPayment.getBalance()+" \nPayPal balance:$"+paypalPayment.getBalance()+"");
            System.out.println("Available coffees: Espresso ($2.0), Cappuccino ($3.0)");
            System.out.print("Choose coffee: ");
            Coffee coffee = factory.createCoffee(in.nextLine());

            System.out.println("Add toppings: Milk (+$0.5), Chocolate (+$0.7)");
            System.out.print("Enter toppings (comma separated): ");
            String[] toppings = in.nextLine().split(",");

            for (String topping : toppings) {
                switch (topping.trim().toLowerCase()) {
                    case "milk" -> coffee = new MilkDecorator(coffee);
                    case "chocolate" -> coffee = new ChocolateDecorator(coffee);
                }
            }

            System.out.println("\nYour order:");
            System.out.println(coffee.getDescription());
            System.out.println("Total cost: $" + coffee.getCost());

            System.out.println("Choose type of payment: Kaspi($"+kaspiPayment.getBalance()+"), PayPal($"+paypalPayment.getBalance()+")");
            String payment = in.next().toLowerCase();
            in.nextLine();
            try {
                switch (payment) {
                    case "kaspi" -> kaspiPayment.Payment(coffee.getCost());
                    case "paypal" -> paypalPayment.Payment(coffee.getCost());
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

        }
    }
}