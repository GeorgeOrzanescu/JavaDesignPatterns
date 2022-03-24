import designPatterns.CancelPizzaOrder;
import designPatterns.Command;
import designPatterns.OrderPizza;
import designPatterns.PizzaFactory;
import designPatterns.WithBacon;
import designPatterns.WithExtraMozzarela;
import designPatterns.Client.Client;
import designPatterns.PizzaClasses.Pizza;


public class App {
    public static void main(String[] args) throws Exception {
        
        //SINGLETON PATTERN
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();


        // FACTORY PATTERN
        Pizza marguerita = pizzaFactory.createPizza("Marguerita");
        Pizza prosciuttoFunghi = pizzaFactory.createPizza("ProsciuttoFunghi");
        Pizza capriciosa = pizzaFactory.createPizza("Capriciosa");

        System.out.println(marguerita);
        System.out.println(prosciuttoFunghi);
        System.out.println(capriciosa);

        // DECORATOR PATTERN
        Pizza margueritaWithBacon = new WithBacon(marguerita);
        Pizza margueritaWithBaconAndExtraMozzarela = new WithExtraMozzarela(margueritaWithBacon);
        System.out.println(margueritaWithBacon.getCost());
        System.out.println(margueritaWithBaconAndExtraMozzarela.getCost());

        // OBSERVER PATTERN
        Client client1 = new Client("John", "London", "123456789");
        Client client2 = new Client("Mary", "Paris", "987654321");
        pizzaFactory.takeOrder("Marguerita", "Bacon", client1);
        pizzaFactory.takeOrder("ProsciuttoFunghi", "Mozzarela", client2);



        // COMMAND PATTERN
        Command orderPizza = new OrderPizza();
        Command cancelPizzaOrder = new CancelPizzaOrder();
        orderPizza.execute(pizzaFactory, "Marguerita", "Mozzarela", client1); // order through command
        cancelPizzaOrder.execute(pizzaFactory, "Marguerita", "Bacon", client2); // cancel through command
        client1.makeCommand("OrderPizza"); // order through client
        client2.makeCommand("CancelPizzaOrder"); // cancel through client
    }
}
