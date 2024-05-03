package entities.Order;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal() {
        this.price = quantity * product.getPrice();
        return this.price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        String priceFormatted = String.format("%.2f", product.getPrice());
        String subtotalFormatted = String.format("%.2f", subTotal());
        return product.getName() + ", $" + priceFormatted + ", Quantity: " + quantity + ", Subtotal: $"
                + subtotalFormatted;
    }

}
