package classes;

public class Product {
    private String name;
    private double price;
    private int quant;

    public double totalValueInStock() {
        return getPrice() * getQuant();
    }

    public void addProducts(int quant) {
        if (quant < 0)
            System.err.println("Invalid value");
        this.quant += quant;
    }

    public void removeProducts(int quant) {
        if (quant > this.quant)
            System.err.println("Invalid Value!");
        this.quant -= quant;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        String data = "Product: " + getName() + " Price: $" + String.format("%.2f", this.price) + " Quantity: "
                + getQuant()
                + " Total: $" + String.format("%.2f", totalValueInStock());
        return data;
    }
}