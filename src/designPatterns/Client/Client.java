package designPatterns.Client;

import java.util.Scanner;

import designPatterns.CancelPizzaOrder;
import designPatterns.Command;
import designPatterns.OrderPizza;
import designPatterns.PizzaFactory;
import designPatterns.PizzaNotification;
import designPatterns.PizzaClasses.Pizza;



public class Client implements PizzaNotification {
    private String name;
    private String address;
    private String phoneNumber;
    private Command command;

    public Client(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void notifyPizzaReady(String notification, Pizza pizza) {
        System.out.println(notification + " is ready" +" and costs " + pizza.getCost());
    }
    
    public String getName() {
        return name;
    }

    public void makeCommand(String type) {
        Scanner scanner = new Scanner(System.in);
        if (type.equals("OrderPizza")) {
            command = new OrderPizza();
            System.out.println("Enter pizza type: ");
            String pizzaType = scanner.nextLine();
            System.out.println("Enter pizza toppings: ");
            String pizzaToppings = scanner.nextLine();
            command.execute(PizzaFactory.getInstance(), pizzaType, pizzaToppings, this);
        }
        
        else if (type.equals("CancelPizzaOrder")) {
            command = new CancelPizzaOrder();
            System.out.println("Enter pizza type: ");
            String pizzaType = scanner.nextLine();
            System.out.println("Enter pizza toppings: ");
            String pizzaToppings = scanner.nextLine();
            command.execute(PizzaFactory.getInstance(), pizzaType, pizzaToppings, this);
        }
        
    }
}
