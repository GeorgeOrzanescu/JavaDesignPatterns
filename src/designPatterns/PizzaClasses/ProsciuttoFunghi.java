package designPatterns.PizzaClasses;

public class ProsciuttoFunghi extends Pizza {
    public ProsciuttoFunghi() {
        super();
        this.getIngredients().add("tomato");
        this.getIngredients().add("mozzarella");
        this.getIngredients().add("mushrooms");
        this.getIngredients().add("basil");
        this.setPrice(16.0f);
        this.setName("ProsciuttoFunghi");
    }
    
    public String toString() {
        return "ProsciuttoFunghi [ingredients=" + this.getIngredients() + ", price=" + this.getCost() + "]";
    }
    
}
