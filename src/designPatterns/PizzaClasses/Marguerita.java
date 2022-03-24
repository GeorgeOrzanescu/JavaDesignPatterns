package designPatterns.PizzaClasses;

public class Marguerita extends Pizza {
    public Marguerita() {
        super();
        this.getIngredients().add("tomato");
        this.getIngredients().add("mozzarella");
        this.getIngredients().add("basil");
        this.getIngredients().add("ham");
        this.setPrice(14.5f);
        this.setName("Marguerita");
    }

    public String toString() {
        return "Marguerita [ingredients=" + this.getIngredients() + ", price=" + this.getCost() + "]";
    }
 
}
