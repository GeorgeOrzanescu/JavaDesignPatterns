package designPatterns;

import designPatterns.Client.Client;

public class CancelPizzaOrder extends Command {

    @Override
    public void execute(PizzaFactory pizzaFactory, String pizzaType, String pizzaToppings, Client client) {
        pizzaFactory.cancelOrder(pizzaType, pizzaToppings, client);
    }
    
}

