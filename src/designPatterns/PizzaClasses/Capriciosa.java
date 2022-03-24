package designPatterns.PizzaClasses;

public class Capriciosa extends Pizza {
    public Capriciosa() {
        super();
        this.getIngredients().add("tomato");
        this.getIngredients().add("mozzarella");
        this.getIngredients().add("onion");
        this.getIngredients().add("ham");
        this.setName("Capriciosa");
        this.setPrice(17.5f);
    }
    
    public String toString() {
        return "Capriciosa [ingredients=" + this.getIngredients() + ", price=" + this.getCost() + "]";
    }
}
