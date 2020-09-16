package supermarket;

import customers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumateja on 23/08/20
 *
 * Store Attendant assists the customers with orders using priority with threads.
 */
public class StoreAttendant {

    private final List<Customer> customersList;
    private final List<String> completedOrders;

    public StoreAttendant() {
        customersList = new ArrayList<>();
        completedOrders = new ArrayList<>();
    }

    public void takeOrder(Customer customer) {
        customersList.add(customer);
        System.out.println("Store Attendant: '" + customer.getName() + ", I've started working your order no: #" + customer.getOrderNumber() + "'");
    }

    public void prepareBilling(String orderToBePrepared) {
        double timeTaken = Math.random() * 10; // give value between 1 and 50
        try {
            Thread.sleep((long) (timeTaken) * 500);
            completedOrders.add(orderToBePrepared);
        } catch (InterruptedException e) {
            System.out.println(" for some reason, drink was not prepared..");
        }
    }

    public void callOutCompletedOrders() {
        customersList.forEach(customer -> {
            System.out.println(customer.getName() + ", Your total order price for items '" + customer.getListOfItems() + "' will be Rs:" + customer.getPrice(customer.getListOfItems()));
            for (String completedOrder : completedOrders) {
                customer.orderReady(completedOrder);
            }
        });
    }
}

