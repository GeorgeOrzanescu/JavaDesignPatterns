package designPatterns.PizzaClasses;

import java.util.ArrayList;

public abstract class Pizza {
    private ArrayList<String> ingredients;
    private String name;
    private float price;

    public Pizza() {
        this.ingredients = new ArrayList<String>();
        this.price = 0.0f;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public float getCost() {
        return this.price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pizza "+ this.name + " " + this.ingredients.toString() + " and costs " + this.getCost();
    }
}
