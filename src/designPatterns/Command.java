package designPatterns;

import designPatterns.Client.Client;

public abstract class Command {
    public abstract void execute(PizzaFactory pizzaFactory,String pizzaType, String pizzaToppings, Client client);
}
