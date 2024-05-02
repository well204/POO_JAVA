package entities.Order;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    int status;

    OrderStatus(int status) {
        this.status = status;
    }
}
