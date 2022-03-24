package designPatterns;

import designPatterns.Client.Client;
import designPatterns.PizzaClasses.Capriciosa;
import designPatterns.PizzaClasses.Marguerita;
import designPatterns.PizzaClasses.Pizza;
import designPatterns.PizzaClasses.ProsciuttoFunghi;
import designPatterns.PizzaClasses.QuatroStagioni;

public class PizzaFactory {
    private static PizzaFactory instance;

    private PizzaFactory() {
    }
    
    public static synchronized PizzaFactory getInstance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Capriciosa")) {
            pizza = new Capriciosa();
        } else if (type.equals("Marguerita")) {
            pizza = new Marguerita();
        } else if (type.equals("ProsciuttoFunghi")) {
            pizza = new ProsciuttoFunghi();
        } else if (type.equals("QuatroStagioni")) {
            pizza = new QuatroStagioni();
        }
        return pizza;
    }

    public Pizza addToping(String toping,Pizza pizza) {
        if (toping.equals("Bacon")) {
            pizza = new WithBacon(pizza);
        } else if (toping.equals("Mozzarela")) {
            pizza = new WithExtraMozzarela(pizza);
        } else if(toping.equals("none")){
            return pizza;
        }
        return pizza;
    }
    // we allow only one toping per pizza just for simplicity
    public Pizza takeOrder(String type, String topings, Client client) {
        System.out.println("Client " + client.getName() + " ordered " + type + " with " + topings);
        Pizza pizza = createPizza(type);
        Pizza finalPizza = addToping(topings,pizza);
        prepare();

        try {
            Thread.sleep(2000);  // simulate time to prepare pizza
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        client.notifyPizzaReady("Dear: " + client.getName() +" your pizza " + type, finalPizza);
        return finalPizza;
    }

    private void prepare() {
        System.out.println("Preparing pizza");
    }
    
}
