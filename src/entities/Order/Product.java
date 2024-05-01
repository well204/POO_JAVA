package entities.Order;

public class Product {
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Product() {
    }

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
