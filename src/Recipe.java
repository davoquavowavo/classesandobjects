public class Recipe {
    public String meat;
    public boolean hotOrCold;
    public int numberOfCarrots;

    public Recipe(String meat, boolean hotOrCold, int numberOfCarrots){
        System.out.println("Recipe in constructor method");
        this.meat = meat;
        this.hotOrCold = hotOrCold;
        this.numberOfCarrots = numberOfCarrots;
    }
public String toString() {
        return "Meat required: " + meat + ", " + "is the temperature of the dish hot: " + hotOrCold + ", " + "the carrots we'll be needing: " + numberOfCarrots;
};

}
