package designPatterns;

import designPatterns.PizzaClasses.Pizza;

public class WithExtraMozzarela extends PizzaTopingDecorator {
    Pizza pizza;

    public WithExtraMozzarela(Pizza pizza) {
        this.pizza = pizza;   
    }

    @Override
    public float getCost() {
        return pizza.getCost() + 1.5f;
    }

}
    

