package designPatterns;

import designPatterns.PizzaClasses.Pizza;

public class WithBacon extends PizzaTopingDecorator {
    Pizza pizza;

    public WithBacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public float getCost() {
        return pizza.getCost() + 1.0f;
    }
    
}
