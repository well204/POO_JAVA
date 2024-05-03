package entities.Order;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class OrderApls {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat birthFormat = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        LocalDateTime time = LocalDateTime.now();
        int numberOfOrders;

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = scanner.nextLine();

        Client client = new Client(name, email, birthFormat.parse(date));

        System.out.print("Enter order status: ");
        int status = scanner.nextInt();
        Order order = new Order(time, OrderStatus.getOrderStatus(status), client);

        System.out.print("How many items for this order? ");
        numberOfOrders = scanner.nextInt();
        for (int i = 1; i <= numberOfOrders; i++) {
            System.out.println("Enter #" + i + " data:");
            scanner.nextLine();
            System.out.print("Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);
        System.out.println();
        scanner.close();
    }
}
