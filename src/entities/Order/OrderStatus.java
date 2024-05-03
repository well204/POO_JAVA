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

    public static OrderStatus getOrderStatus(int status) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.status == status) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code: " + status);
    }
}
