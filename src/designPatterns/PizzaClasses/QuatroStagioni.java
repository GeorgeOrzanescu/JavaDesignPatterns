package designPatterns.PizzaClasses;

public class QuatroStagioni extends Pizza {
    public QuatroStagioni() {
        super();
        this.getIngredients().add("tomato");
        this.getIngredients().add("mozzarella");
        this.getIngredients().add("onion");
        this.getIngredients().add("ham");
        this.setPrice(17.5f);
        this.setName("quatro stagioni");
    }
    
    public String toString() {
        return "QuatroStagioni [ingredients=" + this.getIngredients() + ", price=" + this.getCost() + "]";
    }
    
}
