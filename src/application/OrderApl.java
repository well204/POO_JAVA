package application;

import classes.Order;
import entities.OrderStatus;
import java.util.Date;
import java.util.Scanner;

public class OrderApl {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        Scanner scanner = new Scanner(System.in);
        String status = scanner.nextLine();
        OrderStatus status2 = OrderStatus.valueOf(status);
        System.out.println(status2);
        scanner.close();
    }
}
