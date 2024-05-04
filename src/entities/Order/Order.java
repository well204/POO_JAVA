package entities.Order;

import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;
    private static DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat birthFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        String totalFormat = String.format("%.2f", total());
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: " + fomatter.format(this.moment) + "\n");
        sb.append("Order status: " + this.status + "\n");
        sb.append("Client: " + this.client.getClientName() + " "
                + birthFormat.format(this.client.getClientBirthDate()) + " - "
                + this.client.getClientEmail() + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItem item : items) {
            sb.append(item.toString() + "\n");
        }
        sb.append("Total price: $" + totalFormat);
        return sb.toString();
    }
}
