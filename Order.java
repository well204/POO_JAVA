package classes;

import java.util.Date;
import entities.OrderStatus;

public class Order {
    private Integer orderId;
    private Date orderDate;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer orderId, Date orderDate, OrderStatus status) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", status=" + status + "]";
    }

    public Integer getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
