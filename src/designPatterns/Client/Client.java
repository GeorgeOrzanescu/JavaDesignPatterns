package designPatterns.Client;

import designPatterns.PizzaNotification;
import designPatterns.PizzaClasses.Pizza;

public class Client implements PizzaNotification {
    private String name;
    private String address;
    private String phoneNumber;

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
    
}
