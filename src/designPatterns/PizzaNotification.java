package designPatterns;

import designPatterns.PizzaClasses.Pizza;

public interface PizzaNotification {
    void notifyPizzaReady(String notification,Pizza pizza);
}
