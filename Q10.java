public class Q10 {

    private String name;
    private int numberOfPetals;
    private float price;

    public Q10(String name, int numberOfPetals, float price) {
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String toString() {
        return "Flower: " + name + ", Number of Petals: " + numberOfPetals + ", Price: $" + price;
    }
}

